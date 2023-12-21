package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Parallelogram extends Figure{
    List<ColoredVector> vectors;

    public Parallelogram(ColoredVector coloredVector1, ColoredVector coloredVector2)
    {
        this.vectors = new ArrayList<ColoredVector>();
        this.vectors.add(coloredVector1);
        this.vectors.add(coloredVector2);
    }
    public int perimeterParallelogram() {
        return (int) (this.vectors.get(1).lengthVector() * 2 + this.vectors.get(2).lengthVector() * 2);
    }

    public float squareParallelogram() {
        float sinus, cosinus, lenghtVector1, lenghtVector2;
        lenghtVector1 = this.vectors.get(1).lengthVector();
        lenghtVector2 = this.vectors.get(2).lengthVector();
        cosinus = this.vectors.get(1).scalarProduct(this.vectors.get(2)) / (lenghtVector1 * lenghtVector2);
        sinus = (float) Math.sqrt((1 - Math.pow(cosinus, 2)));
        return lenghtVector1 * lenghtVector2 * sinus;
    }

    @Override
    public void printFigure() {
        vectors.get(1).printColoredVector();
        vectors.get(2).printColoredVector();
    }
}
