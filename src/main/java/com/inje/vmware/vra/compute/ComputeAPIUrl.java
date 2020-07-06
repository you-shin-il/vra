package com.inje.vmware.vra.compute;

/*
* 소문자는 파라메터를 의미함
* */
public enum ComputeAPIUrl {
    MACHINES("/iaas/api/machines"),
    MACHINES_id("/iaas/api/machines/%s"),
    MACHINES_id_OPERATIONS_POWER_OFF("/iaas/api/machines/%s/operations/power-off");

    private String url;

    ComputeAPIUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}