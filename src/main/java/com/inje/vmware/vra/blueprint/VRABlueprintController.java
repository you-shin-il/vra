package com.inje.vmware.vra.blueprint;


import com.inje.vmware.vra.token.VRATokenService;
import com.inje.vmware.vra.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Controller
public class VRABlueprintController {
    final String url = "https://vra.vmkloud.com/csp/gateway/am/api/login?access_token";

    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private VRATokenService vraTokenService;

    @ResponseBody
    @PostMapping("/vra/blueprint/api/blueprints.do")
    public String blueprints() throws IOException {
    /*public String blueprints(@RequestParam String authorization) throws IOException {*/
        String token = vraTokenService.getToken(new User("cone", "admin123!Q"));

/*        Client client = new OkHttpClient();
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
        return null;
    }

}