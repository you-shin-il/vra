package com.inje.vmware.vra.deployments;

/*
* 소문자는 파라메터를 의미함
* */
public enum DeploymentAPIUrl {
    DEPLOYMENTS("/deployment/api/deployments?expandProject=true&expandResources=true&expandLastRequest=true"),
    DEPLOYMENTS_id("https://vra.bi.co.kr/deployment/api/deployments/%s?expandProject=true&expandResources=true&expandLastRequest=true");

    private String url;

    DeploymentAPIUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}