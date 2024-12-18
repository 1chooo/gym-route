package stu_109601003.finalproject.controllers;

public enum PAGE {
    PRIMARY("primary"),
    SECONDARY("secondary"),
    LOGIN("login"),
    RULE("rule"),
    HOME("home"),
    CURRICULUM("curriculum"),
    PREVIEW("preview"),
    CALENDAR("calendar");

    private final String fileName;

    PAGE(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}