package lab3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Точка");
        Point point1 = new Point(2,2,2, "A");
        point1.printMessage();
        point1.printPoint();
        System.out.println();

        System.out.println("Вектор");
        Point point2 = new Point(2,2,2, "B");
        Vector vector = new Vector(point1, point2);
        vector.printVector();
        System.out.println();

        System.out.println("Цветной вектор");
        ColoredVector coloredVector1 = new ColoredVector(point1, point2, "Красный");
        coloredVector1.printColoredVector();
        System.out.println();

        System.out.println("Треугольник");
        Point point3 = new Point(3,3,3, "C");
        Point point4 = new Point(4,4,4, "D");
        ColoredVector coloredVector2 = new ColoredVector(point3, point4, "Синий");
        Triangle triangle = new Triangle(coloredVector1, coloredVector2);
        triangle.printFigure();
        System.out.println();

        System.out.println("Параллелограм");
        Parallelogram parallelogram = new Parallelogram(coloredVector1,coloredVector2);
        parallelogram.printFigure();
    }
}