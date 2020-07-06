package com.inje.vmware.vra.comm;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {
    @JsonProperty("network-interfaces")
    private Hrefs networkInterfaces;
    @JsonProperty("cloud-accounts")
    private Hrefs cloudAccounts;
    @JsonProperty("operations")
    private Hrefs operations;
    @JsonProperty("disks")
    private Hrefs disks;
    @JsonProperty("self")
    private Href self;

    public Link() { }

    public Hrefs getNetworkInterfaces() {
        return networkInterfaces;
    }

    public void setNetworkInterfaces(Hrefs networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public Hrefs getCloudAccounts() {
        return cloudAccounts;
    }

    public void setCloudAccounts(Hrefs cloudAccounts) {
        this.cloudAccounts = cloudAccounts;
    }

    public Hrefs getOperations() {
        return operations;
    }

    public void setOperations(Hrefs operations) {
        this.operations = operations;
    }

    public Hrefs getDisks() {
        return disks;
    }

    public void setDisks(Hrefs disks) {
        this.disks = disks;
    }

    public Href getSelf() {
        return self;
    }

    public void setSelf(Href self) {
        this.self = self;
    }
}
