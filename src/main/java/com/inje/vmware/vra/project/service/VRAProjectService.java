package com.inje.vmware.vra.project.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.project.Project;

import java.net.URISyntaxException;

public interface VRAProjectService {
    public Project projects() throws URISyntaxException, JsonProcessingException;
}