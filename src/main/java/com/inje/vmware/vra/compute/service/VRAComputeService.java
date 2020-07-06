package com.inje.vmware.vra.compute.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.compute.Compute;
import com.inje.vmware.vra.machine.MachineVO;

import java.net.URISyntaxException;
import java.util.HashMap;

public interface VRAComputeService {
    public Compute items() throws URISyntaxException, JsonProcessingException;
    public MachineVO items(String id) throws URISyntaxException, JsonProcessingException;
    public String items(HashMap<String, Object> createMap);
}