package com.inje.vmware.vra.project;

import java.util.List;

public class Project {
    /* 현재 페이지 요소 */
    private int numberOfElements;
    /* 총 요소 수*/
    private int totalElements;
    private List<ProjectVO> content;

    public Project() { }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public List<ProjectVO> getContent() {
        return content;
    }

    public void setContent(List<ProjectVO> content) {
        this.content = content;
    }

}
