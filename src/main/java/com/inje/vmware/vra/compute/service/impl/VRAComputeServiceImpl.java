package com.inje.vmware.vra.compute.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.comm.ObjectMapperUtil;
import com.inje.vmware.vra.compute.Compute;
import com.inje.vmware.vra.compute.ComputeAPIUrl;
import com.inje.vmware.vra.compute.service.VRAComputeService;
import com.inje.vmware.vra.machine.MachineVO;
import com.inje.vmware.vra.project.ProjectVO;
import com.inje.vmware.vra.project.service.VRAProjectService;
import com.inje.vmware.vra.rest.RestFulParam;
import com.inje.vmware.vra.rest.RestFulService;
import com.inje.vmware.vra.rest.URIBuilderUtils;
import com.inje.vmware.vra.token.VRATokenService;
import com.inje.vmware.vra.user.User;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class VRAComputeServiceImpl implements VRAComputeService {

    @Autowired
    private VRATokenService vraTokenService;

    @Autowired
    private RestFulService restFulService;

    @Autowired
    private VRAProjectService vraProjectService;

    @Override
    public Compute items() throws URISyntaxException, JsonProcessingException {
        String token = vraTokenService.getToken(new User("cone", "admin123!Q"));
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(ComputeAPIUrl.MACHINES.getUrl(), null);
        RestFulParam restFulParam = new RestFulParam(uriBuilder, getDefaultHeader(token), null);
        ResponseEntity<Map> stringResponseEntity = restFulService.get(restFulParam);

        Compute compute = (Compute)ObjectMapperUtil.jsonStrConvertObject(stringResponseEntity.getBody(), Compute.class);
        setProjectName(compute.getContent());

        return compute;
    }

    @Override
    public MachineVO items(String id) throws URISyntaxException, JsonProcessingException {
        String token = vraTokenService.getToken(new User("cone", "admin123!Q"));
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(String.format(ComputeAPIUrl.MACHINES_id.getUrl(), id), null);
        RestFulParam restFulParam = new RestFulParam(uriBuilder, getDefaultHeader(token), null);

        ResponseEntity<Map> stringResponseEntity = restFulService.get(restFulParam);

        MachineVO machineVO = (MachineVO)ObjectMapperUtil.jsonStrConvertObject(stringResponseEntity.getBody(), MachineVO.class);
        setProjectName(Arrays.asList(machineVO));

/*        ObjectMapper mapper = new ObjectMapper();
        String responseBodyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stringResponseEntity.getBody());
        MachineVO compute = mapper.readValue(responseBodyJson, MachineVO.class);*/

        return machineVO;
    }

    @Override
    public String items(HashMap<String, Object> createMap) {
        return null;
    }

    private HttpHeaders getDefaultHeader(String token) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.setBearerAuth(token);
        return httpHeaders;
    }

    private void setProjectName(List<MachineVO> machineVOs) throws URISyntaxException, JsonProcessingException {
        List<ProjectVO> projectVOs = vraProjectService.projects().getContent();
        Map<String, String> projectMap = projectVOs.stream().collect(Collectors.toMap(ProjectVO::getId, ProjectVO::getName));

        machineVOs.stream().filter(machineVO -> machineVO.getProjectId() != null)
                           .forEach(machineVO -> {
                               if(projectMap.containsKey(machineVO.getProjectId())) {
                                   machineVO.setProjectName(projectMap.get(machineVO.getProjectId()));
                               }
                           }
        );
    }

}