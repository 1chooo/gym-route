package stu_109601003.finalproject.Handlers;

public enum ARMPART {
    ARM("手臂"),
    BICEPS("肱二頭"),
    TRICEPS("肱三頭");

    private final String name;

    ARMPART(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
