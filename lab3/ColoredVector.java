package lab3;

public class ColoredVector extends Vector {
    String color;
    public ColoredVector(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printColoredVector () {
        super.printVector();
        System.out.println("Цвет: " + color);
    }
}
