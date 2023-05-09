package com.solvd.enums;

public enum Genre {
    FANTASY("Fantasy"), ROMANCE("Romance"), MYSTERY("Mystery"), HISTORICAL_FICTION("Historical Fiction");

    private final String name;

    private Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
