package stu_109601003.finalproject.Parts;

public enum LEG implements MusclePart {
    LEG("腳"),
    HIP("臀"),
    QUADRICEPS("股四頭"),
    HAMSTRINGS("股二頭"),
    CALF("小腿");

    private final String name;

    LEG(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

