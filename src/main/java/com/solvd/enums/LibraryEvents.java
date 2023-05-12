package com.solvd.enums;

public enum LibraryEvents {

    AUTHOR_TALK("Author Talk"),
    BOOK_DISCUSSION("Book Discussion"),
    CHILDREN_STORY_TIME("Children's Story Time"),
    CRAFT_WORKSHOP("Craft Workshop"),
    LECTURE("Lecture"),
    MOVIE_SCREENING("Movie Screening"),
    MUSIC_PERFORMANCE("Music Performance"),
    READING_GROUP("Reading Group"),
    SUPER_SATURDAY("Super Saturday");

    private final String eventName;

    private LibraryEvents(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public String toString() {
        return eventName;
    }
}
