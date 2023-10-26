package com.treeabstraction.entity;

import java.time.LocalDate;
import java.util.List;

public abstract class Tree {
    private Trunk trunk;
    private List<Root> roots;
    //could be addressed in more detail by creating a Genre class and adding sub-genres, special features, etc.
    private String genre;
    private LocalDate plantingDate;

    public Tree(Trunk trunk, List<Root> roots, String genre, LocalDate plantingDate) {
        this.trunk = trunk;
        this.roots = roots;
        this.genre = genre;
        this.plantingDate = plantingDate;
    }

    public void grow() {
        trunk.grow();
        roots.forEach(Root::grow);
    }

}