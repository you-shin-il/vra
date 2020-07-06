package com.inje.vmware.vra.catalog.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.catalog.Catalog;
import com.inje.vmware.vra.machine.MachineVO;

import java.net.URISyntaxException;
import java.util.HashMap;

public interface VRACatalogService {
    public Catalog items() throws URISyntaxException, JsonProcessingException;
    public MachineVO items(String id) throws URISyntaxException, JsonProcessingException;
    public String items(HashMap<String, Object> createMap);
}