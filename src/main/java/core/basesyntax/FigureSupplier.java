package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double valueMin = 1.0;
    private static final double valueMax = 10.0;
    private static final Figure DEFAULT_CIRCLE = new Circle(10, "white");
    private final Figures[] figures = Figures.values();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return DEFAULT_CIRCLE;
    }

    public Figure getRandomFigure() {
        switch (figures[random.nextInt(figures.length)]) {
            case CIRCLE:
                return new Circle(valueMinMax(), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(valueMinMax(), valueMinMax(), valueMinMax(),
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(valueMinMax(), valueMinMax(),
                         colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(valueMinMax(), valueMinMax(), colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(valueMinMax(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public double valueMinMax() {
        return valueMax + random.nextDouble() * (valueMax - valueMin);
    }
}
