package lab3;

// Наследование
public class ColoredVector extends Vector {
    String color;

    public ColoredVector(Point point1, Point point2, String color) {
        super(point1, point2);
        int[] cooridanatesVector = findCoordinates();
        int f = 0;
        // try, catch, throw блоки
        try{
        for (int i = 0; i < 3; i++)
            if (cooridanatesVector[i] == 0)
                f = 1;
        if (f == 1)
            throw new IllegalArgumentException("Координаты вектора не могут быть равны 0");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Ошибка: " + e.getMessage());
        }
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
