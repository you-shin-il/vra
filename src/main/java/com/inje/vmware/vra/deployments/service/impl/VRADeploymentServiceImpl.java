package com.inje.vmware.vra.deployments.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.comm.ObjectMapperUtil;
import com.inje.vmware.vra.deployments.Deployment;
import com.inje.vmware.vra.deployments.DeploymentAPIUrl;
import com.inje.vmware.vra.deployments.DeploymentVO;
import com.inje.vmware.vra.deployments.service.VRADeploymentService;
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
public class VRADeploymentServiceImpl implements VRADeploymentService {

    @Autowired
    private VRATokenService vraTokenService;

    @Autowired
    private RestFulService restFulService;

    @Override
    public Deployment deployments() throws URISyntaxException, JsonProcessingException {
        String token = vraTokenService.getToken(new User("cone", "admin123!Q"));
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(DeploymentAPIUrl.DEPLOYMENTS.getUrl(), null);
        RestFulParam restFulParam = new RestFulParam(uriBuilder, getDefaultHeader(token), null);
        ResponseEntity<Map> stringResponseEntity = restFulService.get(restFulParam);

        Deployment deployment = (Deployment)ObjectMapperUtil.jsonStrConvertObject(stringResponseEntity.getBody(), Deployment.class);

        return deployment;
    }

    @Override
    public DeploymentVO deployments(String id) throws URISyntaxException, JsonProcessingException {
        String token = vraTokenService.getToken(new User("cone", "admin123!Q"));
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(String.format(DeploymentAPIUrl.DEPLOYMENTS.getUrl(), id), null);
        RestFulParam restFulParam = new RestFulParam(uriBuilder, getDefaultHeader(token), null);

        ResponseEntity<Map> stringResponseEntity = restFulService.get(restFulParam);

        DeploymentVO deploymentVO = (DeploymentVO)ObjectMapperUtil.jsonStrConvertObject(stringResponseEntity.getBody(), DeploymentVO.class);

        return deploymentVO;
    }

    private HttpHeaders getDefaultHeader(String token) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.setBearerAuth(token);
        return httpHeaders;
    }

}