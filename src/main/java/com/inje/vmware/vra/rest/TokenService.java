package com.inje.vmware.vra.rest;

import com.inje.vmware.vra.user.User;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class TokenService {
    /*
        API 구분 : Identity Service API
        API NAME : /csp/gateway/am/api/login
    */
    public static final String LOGIN_URL = "/csp/gateway/am/api/login";
    private RestTemplate restTemplate = new RestTemplate();

    public Object post(User user) {
        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` headerR
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // request body parameters
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("username", "cone");
        bodyMap.put("password", "admin123!Q");

        // build the request
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(bodyMap, headers);

        // send POST request
        ResponseEntity<Map> response = restTemplate.postForEntity("https://vra.bi.co.kr/" + LOGIN_URL, entity, Map.class);

        // check response
        if (response.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("Request Successful");
            System.out.println(response.getBody());
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
        }
        Map<String, String> body = response.getBody();
        String token = body.get("cspAuthToken");
        //Object result = response.getHeaders().get("Authorization").stream().findFirst();

        return token;
    }
}