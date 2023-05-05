package com.solvd.interfaces;

public interface IRead {
    default String read() {
        return " is reading ";
    }
}