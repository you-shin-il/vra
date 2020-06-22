package com.inje.vmware.vra.comm;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

@Controller
public class VRALoginController {
    final String url = "https://vra.bi.co.kr/csp/gateway/am/api/login";
    RestTemplate restTemplate = new RestTemplate();

    @ResponseBody
    @PostMapping("/vra/login.do")
    public String login() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("username", "cone");
        parameters.add("password", "admin123!Q");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(parameters, headers);
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, request, String.class);
/*        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json,text/plain");
        RequestBody body = RequestBody.create(mediaType, "{\n\"username\" : \"injeinc\",\n\"password\" : \"vkxmsjdlswo1!\"\n}");
        Request request = new Request.Builder()
                .url("https://vra.vmkloud.com/csp/gateway/am/api/login")
                .method("POST", body)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .addHeader("Content-Type", "text/plain")
                .build();

        Response response = client.newCall(request).execute();
        List<String> headers = response.headers("Authorization");

        return headers.stream().findFirst().get();*/
        return "";
    }

}