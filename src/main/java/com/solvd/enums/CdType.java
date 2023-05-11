package com.solvd.enums;

public enum CdType {
    MUSIC("music"),
    SOFTWARE("software"),
    OTHER("other");
    private final String itemType;

    CdType(String cdType) {
        this.itemType = cdType;
    }

    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
