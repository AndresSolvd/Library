package com.solvd.enums;


public enum LibrarySection {
    FICTION("Fiction"),
    NON_FICTION("Non-fiction"),
    CHILDREN("Children"),
    REFERENCE("Reference"),
    MAGAZINES("Magazines");

    private final String sectionName;

    LibrarySection(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionName() {
        return sectionName;
    }

    @Override
    public String toString() {
        return sectionName;
    }
}
