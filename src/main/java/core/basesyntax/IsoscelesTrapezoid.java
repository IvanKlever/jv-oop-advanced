package core.basesyntax;

public class IsoscelesTrapezoid extends Figur {
    private final double base1;
    private final double base2;
    private final double leg;
    private final double height;

    public IsoscelesTrapezoid(double base1, double base2, double leg, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
        this.height = Math.sqrt(leg * leg - Math.pow((base1 - base2) / 2.0, 2));
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public double getPerimeter() {
        return base1 + base2 + 2 * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, leg: " + leg + " units, height: " + height
                + " units, perimeter: " + getPerimeter() + " units, color: " + super.getColor());
    }
}
