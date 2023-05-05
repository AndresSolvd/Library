package com.solvd.interfaces;

public interface IAudio {
    default String listen() {
        return " is listening ";
    }
}