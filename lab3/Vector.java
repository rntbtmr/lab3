package lab3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Vector {
    private Point point1;
    private Point point2;
    private static int amountVectors; // Статическое поле


    public Vector(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
        amountVectors++;
    }

    public void setPoint1(Point point) {
        this.point1 = point;
    }

    public void setPoint2(Point point) {
        this.point2 = point;
    }

    public Point getPoint1() {
        return this.point1;
    }

    public Point getPoint2() {
        return this.point2;
    }

    //    Массив объектов
    public int[] findCoordinates() {
        int[] coordinates = {point2.getX() - point1.getX(), point2.getY() - point1.getY(), point2.getZ() - point1.getZ()};
        return coordinates;
    }

    public float lengthVector() {
        return (float) Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2) + Math.pow(point2.getZ() - point1.getZ(), 2));
    }

    public float scalarProduct(Vector vector2) {
        int[] coordinatesVector1 = this.findCoordinates();
        int[] coordinatesVector2 = vector2.findCoordinates();
        return coordinatesVector1[0] * coordinatesVector2[0] + coordinatesVector1[1] * coordinatesVector2[1] + coordinatesVector1[2] * coordinatesVector2[2];
    }

    public float additionVectors(Vector vector2) {
        int[] coordinatesVector1 = this.findCoordinates();
        int[] coordinatesVector2 = vector2.findCoordinates();
        int[] coordinates = {
                coordinatesVector1[0] + coordinatesVector2[0], coordinatesVector1[1] + coordinatesVector2[1], coordinatesVector1[2] + coordinatesVector2[2]
        };
        return (float) Math.sqrt(Math.pow(coordinates[0], 2) + Math.pow(coordinates[1], 2) + Math.pow(coordinates[2], 2));
    }

    public void printVector() {
        int[] coordinates = this.findCoordinates();
        System.out.println(String.format("Вектор %s%s(%d, %d, %d)", point1.name, point2.name, coordinates[0], coordinates[1], coordinates[2]));
    }

    public boolean compareLenghtVector(Vector vector1, Vector vector2) {
        return vector1.lengthVector() > vector2.lengthVector();
    }

    public Vector maxLenghtVector(List<Vector> vectors) {
        return vectors.stream().max(Comparator.comparingDouble(Vector::lengthVector)).orElse(null);
    }

    public List<Vector> sortLenghtVector(List<Vector> vectors) {
        return (List<Vector>) vectors.stream().sorted(Comparator.comparingDouble(Vector::lengthVector));
    }
}
