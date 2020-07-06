package com.inje.vmware.vra.deployments;

/*@JsonTypeInfo(
        use= JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MachineResource.class),
        @JsonSubTypes.Type(value = NetworkResource.class),
        @JsonSubTypes.Type(value = DiskResource.class)
})*/
public interface Properties {
}