package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {
    private int id;

    private String name;

    private String description;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {}

    @Override
    public String toString() {
        return super.toString();
    }

    public Supplier() {
        this.id = getId() + 1;
    }

    public Supplier(String name, String description) {
        this.id = getId() + 1;
        this.name = name;
        this.description = description;
    }
}
