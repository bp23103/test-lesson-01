package vending;

/** 飲み物（名前を持つだけ）。読むだけ・完成済み。 */
public class Drink {
    private final String name;

    public Drink(String name) {
        this.name = name;
    }

public String name() {
    return name;
}
}
