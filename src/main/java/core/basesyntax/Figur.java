package core.basesyntax;

public abstract class Figur implements Figure {
    private final String color;

    public Figur(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
