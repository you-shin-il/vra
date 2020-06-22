package com.inje.vmware.vra.token;

public class Token {
    private String username;
    private String password;
    private String cspAuthToken;

    public Token(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getCspAuthToken() {
        return cspAuthToken;
    }

    public void setCspAuthToken(String cspAuthToken) {
        this.cspAuthToken = cspAuthToken;
    }
}