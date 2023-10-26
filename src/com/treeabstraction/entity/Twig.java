package com.treeabstraction.entity;

public class Twig {
    private Integer twigId;
    private Integer thicknessInInches;
    private Integer heightInInches;
    private Integer offshoots;
    private final Integer growRate;

    public Twig() {
        growRate = 1;
    }

    public void grow() {
        this.thicknessInInches = thicknessInInches+growRate;
        heightInInches = heightInInches+growRate;
        offshoots = offshoots + 5*growRate;
    }

    public Integer getTwigId() {
        return twigId;
    }

    public void setTwigId(Integer twigId) {
        this.twigId = twigId;
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

    public Integer getOffshoots() {
        return offshoots;
    }

    public void setOffshoots(Integer offshoots) {
        this.offshoots = offshoots;
    }

    public Integer getGrowRate() {
        return growRate;
    }
}
