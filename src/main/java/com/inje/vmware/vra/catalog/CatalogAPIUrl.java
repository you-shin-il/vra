package com.inje.vmware.vra.catalog;

/*
* 소문자는 파라메터를 의미함
* */
public enum CatalogAPIUrl {
    ITEMS("/catalog/api/items"),
    ITEMS_id("/catalog/api/items/%s");
    //MACHINES_id_OPERATIONS_POWER_OFF("/iaas/api/machines/%s/operations/power-off");

    private String url;

    CatalogAPIUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}