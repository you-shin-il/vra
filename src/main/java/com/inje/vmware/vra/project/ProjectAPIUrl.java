package com.inje.vmware.vra.project;

/*
* 소문자는 파라메터를 의미함
* */
public enum ProjectAPIUrl {
    PROJECTS("/iaas/api/projects");

    private String url;

    ProjectAPIUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}