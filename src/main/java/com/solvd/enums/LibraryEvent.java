package com.solvd.enums;

public enum LibraryEvent {
    BOOK_ADDED("Book Added"), BOOK_REMOVED("Book Removed"), USER_REGISTERED("User Registered");

    private final String name;

    private LibraryEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
