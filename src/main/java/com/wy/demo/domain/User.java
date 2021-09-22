package com.wy.demo.domain;

public class User {
    private String flowId;
    private String name;
    private Integer sort;
    private Integer versionNumber;

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "User{" +
                "flowId='" + flowId + '\'' +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                '}';
    }
}
