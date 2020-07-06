package com.inje.vmware.vra.comm;

import com.fasterxml.jackson.annotation.JsonProperty;

class Href {
    @JsonProperty("href")
    String href;

    public Href() { }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}