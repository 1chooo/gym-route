package stu_109601003.finalproject.Controllers;

public enum PageName {
    PRIMARY("primary"),
    SECONDARY("secondary"),
    LOGIN("login"),
    RULE("rule");

    private final String fileName;

    PageName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}