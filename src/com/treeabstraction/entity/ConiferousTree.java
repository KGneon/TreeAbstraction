package com.treeabstraction.entity;

import java.time.LocalDate;
import java.util.List;

public class ConiferousTree extends Tree {
    private Integer needlesAmount;
    private final Integer amountIncreaseRate;

    public ConiferousTree(Trunk trunk, List<Root> roots, String genre, LocalDate plantingDate, Integer needlesAmount) {
        super(trunk, roots, genre, plantingDate);
        this.needlesAmount = needlesAmount;
        amountIncreaseRate = 1;
    }
    public void grow() {
        super.grow();
        needlesAmount += amountIncreaseRate;
    }
}

