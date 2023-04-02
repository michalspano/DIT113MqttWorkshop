package com.quinstedt.speechtotext;

public enum Colors {
    BLUE("blue"),
    RED("red"),
    BLACK("black"),
    YELLOW("yellow"),
    PINK("pink"),
    GREEN("green"),
    WHITE("white"),
    ORANGE("orange"),
    PURPLE("purple");

    private final String name;

    Colors(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
