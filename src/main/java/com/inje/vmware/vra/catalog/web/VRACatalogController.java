package com.inje.vmware.vra.catalog.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.catalog.Catalog;
import com.inje.vmware.vra.catalog.service.VRACatalogService;
import com.inje.vmware.vra.comm.ObjectMapperUtil;
import com.inje.vmware.vra.machine.MachineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

@RestController
public class VRACatalogController {
    @Autowired
    private VRACatalogService vraCatalogService;

    /*
    * VM 목록 조회 샘플
    * 프로젝트, 호스트, 인스턴스 이름(VM 이름), 이미지 이름, IP주소, 크기(Flavor), 가용 구역(Datacenter?), 전원상태, 생성된 이후 시간
    *
    * */
    @GetMapping("/vra/catalog/api/items.do")
    public Catalog items() throws URISyntaxException, JsonProcessingException {
        Catalog catalog = vraCatalogService.items();
        List<Map<String, Object>> resultMap = (List<Map<String, Object>>) ObjectMapperUtil.objectConvertMap(catalog.getContent(), List.class);
        return catalog;
    }

    @GetMapping("/vra/catalog/api/items.do")
    public MachineVO machines(@RequestParam(name = "id") String id) throws URISyntaxException, JsonProcessingException {
        MachineVO machineVO = vraCatalogService.items(id);
        return machineVO;
    }

}