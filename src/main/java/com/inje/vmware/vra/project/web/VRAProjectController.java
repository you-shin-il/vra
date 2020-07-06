package com.inje.vmware.vra.project.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.project.Project;
import com.inje.vmware.vra.project.service.VRAProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URISyntaxException;

@Controller
public class VRAProjectController {
    @Autowired
    private VRAProjectService vraProjectService;

    /*
    * 프로젝트 조회 샘플
    *
    * */
    @GetMapping("/vra/project/iaas/api/projects.do")
    public String projects() throws URISyntaxException, JsonProcessingException {
        Project projects = vraProjectService.projects();
        return null;
    }

}