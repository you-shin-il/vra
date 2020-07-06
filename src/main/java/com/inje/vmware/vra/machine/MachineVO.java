package com.inje.vmware.vra.machine;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.inje.vmware.vra.comm.Link;

import java.util.List;
import java.util.Map;

public class MachineVO {
    private String powerState;
    private String address;
    private List<Map<String, String>> tags;
    private CustomProperties customProperties;
    private String projectId;
    private String externalRegionId;
    private List<String> cloudAccountIds;
    private String externalId;
    private String name;
    private String id;
    private String createdAt;
    private String updatedAt;
    private String owner;
    private String organizationId;
    private String orgId;
    /* 프로젝트 이름 */
    private String projectName;
    @JsonProperty("_links")
    private Link links;

    public String getPowerState() {
        return powerState;
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Map<String, String>> getTags() {
        return tags;
    }

    public void setTags(List<Map<String, String>> tags) {
        this.tags = tags;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomProperties getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(CustomProperties customProperties) {
        this.customProperties = customProperties;
    }

    public String getExternalRegionId() {
        return externalRegionId;
    }

    public void setExternalRegionId(String externalRegionId) {
        this.externalRegionId = externalRegionId;
    }

    public List<String> getCloudAccountIds() {
        return cloudAccountIds;
    }

    public void setCloudAccountIds(List<String> cloudAccountIds) {
        this.cloudAccountIds = cloudAccountIds;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    class CustomProperties {
        private String image;
        private String osType;
        private String vcUuid;
        private int memoryGB;
        private String datacenter;
        private String provisionGB;
        private String softwareName;
        private String datastoreName;
        private int cpuCount;
        private int memoryInMB;
        private String cloudConfig;

        public CustomProperties() {}

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getOsType() {
            return osType;
        }

        public String getDatastoreName() {
            return datastoreName;
        }

        public void setDatastoreName(String datastoreName) {
            this.datastoreName = datastoreName;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public String getVcUuid() {
            return vcUuid;
        }

        public void setVcUuid(String vcUuid) {
            this.vcUuid = vcUuid;
        }

        public int getMemoryGB() {
            return memoryGB;
        }

        public void setMemoryGB(int memoryGB) {
            this.memoryGB = memoryGB;
        }

        public String getDatacenter() {
            return datacenter;
        }

        public void setDatacenter(String datacenter) {
            this.datacenter = datacenter;
        }

        public String getProvisionGB() {
            return provisionGB;
        }

        public void setProvisionGB(String provisionGB) {
            this.provisionGB = provisionGB;
        }

        public String getSoftwareName() {
            return softwareName;
        }

        public void setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
        }

        public int getCpuCount() {
            return cpuCount;
        }

        public void setCpuCount(int cpuCount) {
            this.cpuCount = cpuCount;
        }

        public int getMemoryInMB() {
            return memoryInMB;
        }

        public void setMemoryInMB(int memoryInMB) {
            this.memoryInMB = memoryInMB;
        }

        public String getCloudConfig() {
            return cloudConfig;
        }

        public void setCloudConfig(String cloudConfig) {
            this.cloudConfig = cloudConfig;
        }
    }

}