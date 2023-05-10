package com.solvd.enums;

public enum Genre {
    FICTION("Fiction"),
    NON_FICTION("Non-fiction"),
    DYSTOPIAN_FICTION("Dystopian fiction"),
    MYSTERY("Mystery"),
    ROMANCE("Romance"),
    HORROR("Horror"),
    SCIENCE_FICTION("Science Fiction"),
    FANTASY("Fantasy"),
    BIOGRAPHY("Biography"),
    AUTOBIOGRAPHY("Autobiography"),
    SOUTHERN_GOTHIC("Southern Gothic");


    private final String genreName;

    Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }
}

