package com.solvd.enums;

public enum Schedule {

    MONDAY("Monday: Closed"),
    TUESDAY("Tuesday: 10H00 to 17H00"),
    WEDNESDAY("Wednesday: 10H00 to 17H00"),
    THURSDAY("Thursday: 10H00 to 17H00"),
    FRIDAY("Friday: 10H00 to 17H00"),
    SATURDAY("Saturday: 10H00 to 14H00"),
    SUNDAY("Sunday: 10H00 to 14H00");

    private final String dayName;

    Schedule(String dayName) {
        this.dayName = dayName;
    }

    public String getSchedule() {
        return dayName;
    }

    @Override
    public String toString() {
        return dayName;
    }
}

