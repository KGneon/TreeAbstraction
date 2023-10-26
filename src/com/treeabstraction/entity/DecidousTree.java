package com.treeabstraction.entity;

import java.time.LocalDate;
import java.util.List;

public class DecidousTree extends Tree{
    private Integer leavesAmount;
    private final Integer amountIncreaseRate;

    public DecidousTree(Trunk trunk, List<Root> roots, String genre, LocalDate plantingDate, Integer leavesAmount) {
        super(trunk, roots, genre, plantingDate);
        this.leavesAmount = leavesAmount;
        amountIncreaseRate = 1;
    }

    public void grow() {
        super.grow();
        leavesAmount += amountIncreaseRate;
    }
}
