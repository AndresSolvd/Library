package com.solvd.enums;

public enum ItemType {
    EBOOK("eBook"),
    PRINTEDBOOK("PrintedBook"),
    AUDIOBOOK("AudioBook");
    private final String itemType;

    ItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
