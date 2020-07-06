package com.inje.vmware.vra.deployments;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Cloud.vSphere.Disk")
public class DiskResource extends Resources {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public static class Properties {
        private String resourceId;
        private String resourceDescLink;
        private String diskPlacementRef;
        private String type;
        private String provisionGB;
        private String zone;
        private String id;
        private String persistent;
        private String endpointType;
        private String resourceName;
        private int capacityGb;
        private String vm;
        private String name;
        private String resourceLink;
        private String region;
        private String status;
        private String independent;
        private String componentType;
        private boolean encrypted;
        private String provisioningType;
        private String account;
        private String vcUuid;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceDescLink() {
            return resourceDescLink;
        }

        public void setResourceDescLink(String resourceDescLink) {
            this.resourceDescLink = resourceDescLink;
        }

        public String getDiskPlacementRef() {
            return diskPlacementRef;
        }

        public void setDiskPlacementRef(String diskPlacementRef) {
            this.diskPlacementRef = diskPlacementRef;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProvisionGB() {
            return provisionGB;
        }

        public void setProvisionGB(String provisionGB) {
            this.provisionGB = provisionGB;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPersistent() {
            return persistent;
        }

        public void setPersistent(String persistent) {
            this.persistent = persistent;
        }

        public String getEndpointType() {
            return endpointType;
        }

        public void setEndpointType(String endpointType) {
            this.endpointType = endpointType;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public int getCapacityGb() {
            return capacityGb;
        }

        public void setCapacityGb(int capacityGb) {
            this.capacityGb = capacityGb;
        }

        public String getVm() {
            return vm;
        }

        public void setVm(String vm) {
            this.vm = vm;
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

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getIndependent() {
            return independent;
        }

        public void setIndependent(String independent) {
            this.independent = independent;
        }

        public String getComponentType() {
            return componentType;
        }

        public void setComponentType(String componentType) {
            this.componentType = componentType;
        }

        public boolean isEncrypted() {
            return encrypted;
        }

        public void setEncrypted(boolean encrypted) {
            this.encrypted = encrypted;
        }

        public String getProvisioningType() {
            return provisioningType;
        }

        public void setProvisioningType(String provisioningType) {
            this.provisioningType = provisioningType;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getVcUuid() {
            return vcUuid;
        }

        public void setVcUuid(String vcUuid) {
            this.vcUuid = vcUuid;
        }
    }
}