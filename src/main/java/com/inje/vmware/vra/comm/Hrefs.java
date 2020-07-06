package com.inje.vmware.vra.comm;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

class Hrefs {
    @JsonProperty("hrefs")
    List<String> hrefs;

    public Hrefs() { }

    public List<String> getHrefs() {
        return hrefs;
    }

    public void setHrefs(List<String> hrefs) {
        this.hrefs = hrefs;
    }
}
