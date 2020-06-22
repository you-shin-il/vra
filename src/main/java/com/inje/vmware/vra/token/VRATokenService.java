package com.inje.vmware.vra.token;

import com.inje.vmware.vra.rest.Restful;
import com.inje.vmware.vra.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "vraTokenService")
public class VRATokenService {

    @Autowired
    private Restful restful;

    public String getToken(User user) {
        return (String)restful.post(user);
    }
}