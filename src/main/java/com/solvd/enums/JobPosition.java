package com.solvd.enums;

public enum JobPosition {

    LIBRARIAN("librarian"),
    MANAGER("manager"),
    ARCHIVIST("archivist"),
    TECHNICAL_SUPPORT("technical_support"),
    EVENTS_ORGANIZER("events_organizer");

    private final String jobPosition;

    JobPosition(String jobPosition){

        this.jobPosition = jobPosition;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
