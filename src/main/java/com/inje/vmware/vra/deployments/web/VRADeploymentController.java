package com.inje.vmware.vra.deployments.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.comm.ObjectMapperUtil;
import com.inje.vmware.vra.deployments.Deployment;
import com.inje.vmware.vra.deployments.DeploymentVO;
import com.inje.vmware.vra.deployments.service.VRADeploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

@RestController
public class VRADeploymentController {
    @Autowired
    private VRADeploymentService vraDeploymentService;

    /*
    * 배포 목록 조회 샘플
    *
    * */
    @GetMapping("/vra/deployment/iaas/api/deployments.do")
    public Deployment deployments() throws URISyntaxException, JsonProcessingException {
        Deployment deployments = vraDeploymentService.deployments();
        List<Map<String, Object>> resultMap = (List<Map<String, Object>>) ObjectMapperUtil.objectConvertMap(deployments.getContent(), List.class);
        return deployments;
    }

    @GetMapping("/vra/deployment/iaas/api/deployment.do")
    public DeploymentVO deployment(@RequestParam(name = "id") String id) throws URISyntaxException, JsonProcessingException {
        DeploymentVO deployments = vraDeploymentService.deployments(id);
        return deployments;
    }

}