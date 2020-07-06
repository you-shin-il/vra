package com.inje.vmware.vra.compute.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inje.vmware.vra.comm.ObjectMapperUtil;
import com.inje.vmware.vra.compute.Compute;
import com.inje.vmware.vra.compute.service.VRAComputeService;
import com.inje.vmware.vra.machine.MachineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

@RestController
public class VRAComputeController {
    @Autowired
    private VRAComputeService vraComputeService;

    /*
    * VM 목록 조회 샘플
    * 프로젝트, 호스트, 인스턴스 이름(VM 이름), 이미지 이름, IP주소, 크기(Flavor), 가용 구역(Datacenter?), 전원상태, 생성된 이후 시간
    *
    * */
    @GetMapping("/vra/compute/iaas/api/machines.do")
    public Compute machines() throws URISyntaxException, JsonProcessingException {
        Compute machines = vraComputeService.items();
        List<Map<String, Object>> resultMap = (List<Map<String, Object>>) ObjectMapperUtil.objectConvertMap(machines.getContent(), List.class);
        return machines;
    }

    @GetMapping("/vra/compute/iaas/api/machine.do")
    public MachineVO machines(@RequestParam(name = "id") String id) throws URISyntaxException, JsonProcessingException {
        MachineVO machineVO = vraComputeService.items(id);
        return machineVO;
    }

}