package com.inje.vmware.vra.deployments;

import java.util.List;

public class NetworkProperties implements Properties {
    private String id;
    private String name;
    private String type;
    private String resourceDescLink;
    private String networkCidr;
    private String prefixLength;
    private String netmask;
    private String networkType;
    private String endpointType;
    private List<String> dns;
    private String resourceName;
    private String domain;
    private String resourceLink;
    private String account;
    private String gateway;
    //TODO List<String>이 맞는지 확인필요
    private List<String> dnsSearchDomains;
    private String syncStatus;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResourceDescLink() {
        return resourceDescLink;
    }

    public void setResourceDescLink(String resourceDescLink) {
        this.resourceDescLink = resourceDescLink;
    }

    public String getNetworkCidr() {
        return networkCidr;
    }

    public void setNetworkCidr(String networkCidr) {
        this.networkCidr = networkCidr;
    }

    public String getPrefixLength() {
        return prefixLength;
    }

    public void setPrefixLength(String prefixLength) {
        this.prefixLength = prefixLength;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getEndpointType() {
        return endpointType;
    }

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceLink() {
        return resourceLink;
    }

    public void setResourceLink(String resourceLink) {
        this.resourceLink = resourceLink;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public List<String> getDnsSearchDomains() {
        return dnsSearchDomains;
    }

    public void setDnsSearchDomains(List<String> dnsSearchDomains) {
        this.dnsSearchDomains = dnsSearchDomains;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }
}