package com.inje.vmware.vra.token;

import com.inje.vmware.vra.rest.TokenService;
import com.inje.vmware.vra.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "vraTokenService")
public class VRATokenService {

    @Autowired
    private TokenService tokenService;

    public String getToken(User user) {
        return (String) tokenService.post(user);
    }
}