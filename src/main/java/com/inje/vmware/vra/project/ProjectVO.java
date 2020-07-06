package com.inje.vmware.vra.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.inje.vmware.vra.comm.Link;

import java.util.List;
import java.util.Map;

public class ProjectVO {
    private List<Map<String, String>> administrators;
    /* Location에 zone과 속성 다름 */
    //private List<Map<String, Object>> zones;
    @JsonProperty("zones")
    private List<ZoneVO> zones;
    private String machineNamingTemplate;
    //TODO 결과값 확인 후 재정의 필요
    private List<Map<String, Object>> members;
    //TODO 결과값 확인 후 재정의 필요
    private Map<String, Object> constraints;
    private int operationTimeout;
    private boolean sharedResources;
    private String name;
    private String description;
    private String id;
    private String organizationId;
    private String orgId;
    @JsonProperty("_links")
    private Link links;

    public ProjectVO() { }

    public List<ZoneVO> getZones() {
        return zones;
    }

    public void setZones(List<ZoneVO> zones) {
        this.zones = zones;
    }

    /*    public List<Map<String, Object>> getZones() {
        return zones;
    }

    public void setZones(List<Map<String, Object>> zones) {
        this.zones = zones;
    }*/

    public String getMachineNamingTemplate() {
        return machineNamingTemplate;
    }

    public void setMachineNamingTemplate(String machineNamingTemplate) {
        this.machineNamingTemplate = machineNamingTemplate;
    }

    public List<Map<String, String>> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Map<String, String>> administrators) {
        this.administrators = administrators;
    }

    public List<Map<String, Object>> getMembers() {
        return members;
    }

    public void setMembers(List<Map<String, Object>> members) {
        this.members = members;
    }

    public Map<String, Object> getConstraints() {
        return constraints;
    }

    public void setConstraints(Map<String, Object> constraints) {
        this.constraints = constraints;
    }

    public int getOperationTimeout() {
        return operationTimeout;
    }

    public void setOperationTimeout(int operationTimeout) {
        this.operationTimeout = operationTimeout;
    }

    public boolean isSharedResources() {
        return sharedResources;
    }

    public void setSharedResources(boolean sharedResources) {
        this.sharedResources = sharedResources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }

    private static class ZoneVO {
        @JsonProperty("zoneId")
        private String zoneId;
        @JsonProperty("priority")
        private int priority;
        @JsonProperty("maxNumberInstances")
        private int maxNumberInstances;

        public ZoneVO() { }

        public String getZoneId() {
            return zoneId;
        }

        public void setZoneId(String zoneId) {
            this.zoneId = zoneId;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getMaxNumberInstances() {
            return maxNumberInstances;
        }

        public void setMaxNumberInstances(int maxNumberInstances) {
            this.maxNumberInstances = maxNumberInstances;
        }
    }
}