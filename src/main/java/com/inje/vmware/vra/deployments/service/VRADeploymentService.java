package com.inje.vmware.vra.deployments.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.deployments.Deployment;
import com.inje.vmware.vra.deployments.DeploymentVO;

import java.net.URISyntaxException;

public interface VRADeploymentService {
    public Deployment deployments() throws URISyntaxException, JsonProcessingException;
    public DeploymentVO deployments(String id) throws URISyntaxException, JsonProcessingException;
}