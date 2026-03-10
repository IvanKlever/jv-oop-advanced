package core.basesyntax;

public class Square extends Figur {
    private final double sizeA;

    public Square(double sizeA, String color) {
        super(color);
        this.sizeA = sizeA;
    }

    @Override
    public double getArea() {
        return sizeA * sizeA;
    }

    @Override
    public double getPerimeter() {
        return sizeA * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, size: " + sizeA + " units, area: "
                + getArea() + " sq. units, perimeter: " + getPerimeter()
                + " units, color: " + super.getColor());
    }
}
