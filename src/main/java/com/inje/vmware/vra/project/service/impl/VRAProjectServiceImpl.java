package com.inje.vmware.vra.project.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inje.vmware.vra.project.ProjectAPIUrl;
import com.inje.vmware.vra.project.Project;
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
import java.util.Collections;
import java.util.Map;

@Service
public class VRAProjectServiceImpl implements VRAProjectService {

    @Autowired
    private VRATokenService vraTokenService;

    @Autowired
    private RestFulService restFulService;

    @Override
    public Project projects() throws URISyntaxException, JsonProcessingException {
        String token = vraTokenService.getToken(new User("cone", "admin123!Q"));
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(ProjectAPIUrl.PROJECTS.getUrl(), null);
        RestFulParam restFulParam = new RestFulParam(uriBuilder, getDefaultHeader(token), null);

        ResponseEntity<Map> stringResponseEntity = restFulService.get(restFulParam);

        ObjectMapper mapper = new ObjectMapper();
        String responseBodyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stringResponseEntity.getBody());
        Project project = mapper.readValue(responseBodyJson, Project.class);
        System.out.println(project);
        return project;
    }

    private HttpHeaders getDefaultHeader(String token) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.setBearerAuth(token);
        return httpHeaders;
    }
}
