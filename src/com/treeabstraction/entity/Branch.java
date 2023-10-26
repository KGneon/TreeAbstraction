package com.treeabstraction.entity;

import java.util.List;

public class Branch {
    private Integer branchId;
    private Integer thicknessInInches;
    private Integer heightInInches;
    private List<Twig> twigs;
    private final Integer growRate;

    public Branch() {
        growRate = 1;
    }

    public void grow() {
        this.thicknessInInches = thicknessInInches+growRate;
        heightInInches = heightInInches+growRate;
        twigs.forEach(Twig::grow);
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
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

    public List<Twig> getTwigs() {
        return twigs;
    }

    public void setTwigs(List<Twig> twigs) {
        this.twigs = twigs;
    }

    public Integer getGrowRate() {
        return growRate;
    }
}
