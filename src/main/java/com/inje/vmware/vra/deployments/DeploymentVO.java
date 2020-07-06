package com.inje.vmware.vra.deployments;

import java.util.List;
import java.util.Map;

public class DeploymentVO {
    private String id;
    private String name;
    private String description;
    private String orgId;
    private String catalogItemId;
    private String catalogItemVersion;
    private String blueprintId;
    private String blueprintVersion;
    private String createdAt;
    private String createdBy;
    private String lastUpdatedAt;
    private String lastUpdatedBy;
    private String leaseExpireAt;
    private Map<String, Object> inputs;
    private List<Resources> resources;
    private Project project;
    private LastRequest lastRequest;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getCatalogItemId() {
        return catalogItemId;
    }

    public void setCatalogItemId(String catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    public String getCatalogItemVersion() {
        return catalogItemVersion;
    }

    public void setCatalogItemVersion(String catalogItemVersion) {
        this.catalogItemVersion = catalogItemVersion;
    }

    public String getBlueprintId() {
        return blueprintId;
    }

    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    public String getBlueprintVersion() {
        return blueprintVersion;
    }

    public void setBlueprintVersion(String blueprintVersion) {
        this.blueprintVersion = blueprintVersion;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLeaseExpireAt() {
        return leaseExpireAt;
    }

    public void setLeaseExpireAt(String leaseExpireAt) {
        this.leaseExpireAt = leaseExpireAt;
    }

    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    public List<Resources> getResources() {
        return resources;
    }

    public void setResources(List<Resources> resources) {
        this.resources = resources;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public LastRequest getLastRequest() {
        return lastRequest;
    }

    public void setLastRequest(LastRequest lastRequest) {
        this.lastRequest = lastRequest;
    }

    public static class Project {
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class LastRequest {
        private String id;
        private String name;
        private String deploymentId;
        private String createdAt;
        private String updatedAt;
        private String requestedBy;
        private String requester;
        private String blueprintId;
        private String actionId;
        private int completedTasks;
        private int totalTasks;
        private String status;
        private Map<String, Object> inputs;
        private boolean dismissed;
        private boolean cancelable;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDeploymentId() {
            return deploymentId;
        }

        public void setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
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

        public String getRequestedBy() {
            return requestedBy;
        }

        public void setRequestedBy(String requestedBy) {
            this.requestedBy = requestedBy;
        }

        public String getRequester() {
            return requester;
        }

        public void setRequester(String requester) {
            this.requester = requester;
        }

        public String getBlueprintId() {
            return blueprintId;
        }

        public void setBlueprintId(String blueprintId) {
            this.blueprintId = blueprintId;
        }

        public String getActionId() {
            return actionId;
        }

        public void setActionId(String actionId) {
            this.actionId = actionId;
        }

        public int getCompletedTasks() {
            return completedTasks;
        }

        public void setCompletedTasks(int completedTasks) {
            this.completedTasks = completedTasks;
        }

        public int getTotalTasks() {
            return totalTasks;
        }

        public void setTotalTasks(int totalTasks) {
            this.totalTasks = totalTasks;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Map<String, Object> getInputs() {
            return inputs;
        }

        public void setInputs(Map<String, Object> inputs) {
            this.inputs = inputs;
        }

        public boolean isDismissed() {
            return dismissed;
        }

        public void setDismissed(boolean dismissed) {
            this.dismissed = dismissed;
        }

        public boolean isCancelable() {
            return cancelable;
        }

        public void setCancelable(boolean cancelable) {
            this.cancelable = cancelable;
        }
    }
}