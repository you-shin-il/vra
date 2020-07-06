package com.inje.vmware.vra.rest;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class RestFulService {
    private RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> post(RestFulParam restFulParam) {
        return null;
/*        HttpHeaders headers = restFulParam.getHeaders();
        Map<String, Object> bodyMap = restFulParam.getBodyMap();
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(bodyMap, headers);
        ResponseEntity<String> response = restTemplate.getForEntity("https://vra.bi.co.kr/", String.class, entity);
        return response;*/
    }

    public ResponseEntity<Map> get(RestFulParam restFulParam) {
        ResponseEntity<Map> responseEntity = restTemplate.exchange(restFulParam.getUriBuilder().toString(), HttpMethod.GET, restFulParam.getEntity(), Map.class);
        //ResponseEntity<String> response = restTemplate.getForEntity(restFulParam.getUriBuilder().toString(), String.class, restFulParam.getHeaders());
        return responseEntity;
    }

    public Object patch(RestFulParam restFulParam) {
        return null;
    }

    public Object delete(RestFulParam restFulParam) {
        return null;
    }
}