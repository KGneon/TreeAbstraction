package com.treeabstraction.entity;

public class Root {
    private Integer id;
    private Integer thicknessInInches;
    private Integer lengthInInches;
    private Integer offshootsNumber;
    private final Integer growRate;

    public Root() {
        growRate = 1;
    }

    public void grow() {
        this.thicknessInInches = thicknessInInches+growRate;
        lengthInInches = lengthInInches+growRate;
        offshootsNumber = offshootsNumber + 5*growRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThicknessInInches() {
        return thicknessInInches;
    }

    public void setThicknessInInches(Integer thicknessInInches) {
        this.thicknessInInches = thicknessInInches;
    }

    public Integer getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(Integer lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public Integer getOffshootsNumber() {
        return offshootsNumber;
    }

    public void setOffshootsNumber(Integer offshootsNumber) {
        this.offshootsNumber = offshootsNumber;
    }

    public Integer getGrowRate() {
        return growRate;
    }
}
