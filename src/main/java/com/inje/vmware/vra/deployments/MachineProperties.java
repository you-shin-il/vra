package com.inje.vmware.vra.deployments;

import java.util.List;
import java.util.Map;

public class MachineProperties implements Properties {
    private String id;
    private String name;
    private String resourceDescLink;
    private String project;
    private String provisionGB;
    private String powerState;
    private String zone;
    private String environmentName;
    private String hasSnapshots;
    private String computeHostType;
    private String memoryGB;
    private String cpuCount;
    private String image;
    private int totalMemoryMB;
    private String endpointType;
    private String resourceName;
    private Map<String, String> tags;
    private String flavor;
    private String softwareName;
    private String resourceLink;
    private String region;
    private Storage storage;
    private List<Network> network;
    private String osType;
    private String resourcePool;
    private String componentType;
    private String address;
    private String datacenter;
    private String datastoreName;
    private String primaryMAC;
    private String computeHostRef;
    private String account;
    private String vcUuid;
    private String syncStatus;

    public String getResourceDescLink() {
        return resourceDescLink;
    }

    public void setResourceDescLink(String resourceDescLink) {
        this.resourceDescLink = resourceDescLink;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProvisionGB() {
        return provisionGB;
    }

    public void setProvisionGB(String provisionGB) {
        this.provisionGB = provisionGB;
    }

    public String getPowerState() {
        return powerState;
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public String getHasSnapshots() {
        return hasSnapshots;
    }

    public void setHasSnapshots(String hasSnapshots) {
        this.hasSnapshots = hasSnapshots;
    }

    public String getComputeHostType() {
        return computeHostType;
    }

    public void setComputeHostType(String computeHostType) {
        this.computeHostType = computeHostType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(String memoryGB) {
        this.memoryGB = memoryGB;
    }

    public String getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(String cpuCount) {
        this.cpuCount = cpuCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTotalMemoryMB() {
        return totalMemoryMB;
    }

    public void setTotalMemoryMB(int totalMemoryMB) {
        this.totalMemoryMB = totalMemoryMB;
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

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
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

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public List<Network> getNetwork() {
        return network;
    }

    public void setNetwork(List<Network> network) {
        this.network = network;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(String resourcePool) {
        this.resourcePool = resourcePool;
    }

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }

    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public String getPrimaryMAC() {
        return primaryMAC;
    }

    public void setPrimaryMAC(String primaryMAC) {
        this.primaryMAC = primaryMAC;
    }

    public String getComputeHostRef() {
        return computeHostRef;
    }

    public void setComputeHostRef(String computeHostRef) {
        this.computeHostRef = computeHostRef;
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

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public static class Storage {
        List<Map<String, Object>> disks;

        public List<Map<String, Object>> getDisks() {
            return disks;
        }

        public void setDisks(List<Map<String, Object>> disks) {
            this.disks = disks;
        }
    }

    public static class Network {
        List<Map<String, Object>> networks;

        public List<Map<String, Object>> getNetworks() {
            return networks;
        }

        public void setNetworks(List<Map<String, Object>> networks) {
            this.networks = networks;
        }
    }


}