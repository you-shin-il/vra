package com.inje.vmware.vra.compute;

import com.inje.vmware.vra.machine.MachineVO;

import java.util.List;

public class Compute {
    /* 현재 페이지 요소 */
    private int numberOfElements;
    /* 총 요소 수*/
    private int totalElements;
    private List<MachineVO> content;

    public Compute() { }

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

    public List<MachineVO> getContent() {
        return content;
    }

    public void setContent(List<MachineVO> content) {
        this.content = content;
    }
}