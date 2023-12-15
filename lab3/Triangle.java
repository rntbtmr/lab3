package lab3;

public class Triangle extends Figure{
    private final ColoredVector coloredVector1;
    private final ColoredVector coloredVector2;

    public Triangle(ColoredVector coloredVector1, ColoredVector coloredVector2) {
        this.coloredVector1 = coloredVector1;
        this.coloredVector2 = coloredVector2;
    }
    public int perimeterTriangle() {
        return (int) (coloredVector1.lengthVector() + coloredVector2.lengthVector() + coloredVector1.additionVectors(coloredVector2));
    }

    @Override
    public void printFigure() {
        coloredVector1.printColoredVector();
        coloredVector2.printColoredVector();
    }
}
