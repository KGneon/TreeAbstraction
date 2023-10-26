package com.treeabstraction.entity;

import java.util.List;

public class Trunk {
    private Integer trunkId;
    private Integer thicknessInInches;
    private Integer heightInInches;
    private List<Branch> branches;
    private final Integer growRate;

    public Trunk() {
        growRate = 1;
    }

    public void grow() {
        this.thicknessInInches = thicknessInInches+growRate;
        heightInInches = heightInInches+growRate;
        branches.forEach(Branch::grow);
    }

    public Integer getTrunkId() {
        return trunkId;
    }

    public void setTrunkId(Integer trunkId) {
        this.trunkId = trunkId;
    }

    public Integer getThicknessInInches() {
        return thicknessInInches;
    }

    public void setThicknessInInches(Integer thicknessInInches) {
        this.thicknessInInches = thicknessInInches;
    }

    public Integer getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(Integer heightInInches) {
        this.heightInInches = heightInInches;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public Integer getGrowRate() {
        return growRate;
    }
}
