package com.inje.vmware.vra.deployments;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;
import java.util.Map;

@JsonTypeName("Cloud.vSphere.Machine")
public class MachineResource extends Resources {
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
        private String project;
        private String provisionGB;
        private String powerState;
        private String zone;
        private String environmentName;
        private String hasSnapshots;
        private String computeHostType;
        private String id;
        private String memoryGB;
        private String cpuCount;
        private String image;
        private int totalMemoryMB;
        private String endpointType;
        private String resourceName;
        private List<Map<String, Object>> tags;
        private String flavor;
        private String softwareName;
        private String name;
        private String resourceLink;
        private String region;
        private String cloudConfig;
        private List<MachineResource.Properties.AttachedDisks> attachedDisks;
        private Storage storage;
        private List<Network> networks;
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

        public String getCloudConfig() {
            return cloudConfig;
        }

        public void setCloudConfig(String cloudConfig) {
            this.cloudConfig = cloudConfig;
        }

        public List<AttachedDisks> getAttachedDisks() {
            return attachedDisks;
        }

        public void setAttachedDisks(List<AttachedDisks> attachedDisks) {
            this.attachedDisks = attachedDisks;
        }

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

        public List<Map<String, Object>> getTags() {
            return tags;
        }

        public void setTags(List<Map<String, Object>> tags) {
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

        public Storage getStorage() {
            return storage;
        }

        public void setStorage(Storage storage) {
            this.storage = storage;
        }

        public List<Network> getNetworks() {
            return networks;
        }

        public void setNetworks(List<Network> networks) {
            this.networks = networks;
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
            private String address;
            private boolean assignPublicIpAddress;
            private String assignment;
            private String mac_address;
            private String name;
            private String resourceName;
            private List<String> ipv6Addresses;
            private int deviceIndex;
            private String network;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public boolean isAssignPublicIpAddress() {
                return assignPublicIpAddress;
            }

            public void setAssignPublicIpAddress(boolean assignPublicIpAddress) {
                this.assignPublicIpAddress = assignPublicIpAddress;
            }

            public String getAssignment() {
                return assignment;
            }

            public void setAssignment(String assignment) {
                this.assignment = assignment;
            }

            public String getMac_address() {
                return mac_address;
            }

            public void setMac_address(String mac_address) {
                this.mac_address = mac_address;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getResourceName() {
                return resourceName;
            }

            public void setResourceName(String resourceName) {
                this.resourceName = resourceName;
            }

            public List<String> getIpv6Addresses() {
                return ipv6Addresses;
            }

            public void setIpv6Addresses(List<String> ipv6Addresses) {
                this.ipv6Addresses = ipv6Addresses;
            }

            public int getDeviceIndex() {
                return deviceIndex;
            }

            public void setDeviceIndex(int deviceIndex) {
                this.deviceIndex = deviceIndex;
            }

            public String getNetwork() {
                return network;
            }

            public void setNetwork(String network) {
                this.network = network;
            }
        }

        public static class AttachedDisks {
            private String source;

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }
        }
    }
}