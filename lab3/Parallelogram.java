package lab3;

public class Parallelogram {
    private final ColoredVector coloredVector1;
    private final ColoredVector coloredVector2;

    public Parallelogram(ColoredVector coloredVector1, ColoredVector coloredVector2)
    {
        this.coloredVector1 = coloredVector1;
        this.coloredVector2 = coloredVector2;
    }
    public int perimeterParallelogram() {
        return (int) (this.coloredVector1.lengthVector() * 2 + this.coloredVector2.lengthVector() * 2);
    }

    public float squareParallelogram() {
        float sinus, cosinus, lenghtVector1, lenghtVector2;
        lenghtVector1 = this.coloredVector1.lengthVector();
        lenghtVector2 = this.coloredVector2.lengthVector();
        cosinus = this.coloredVector1.scalarProduct(this.coloredVector2) / (lenghtVector1 * lenghtVector2);
        sinus = (float) Math.sqrt((1 - Math.pow(cosinus, 2)));
        return lenghtVector1 * lenghtVector2 * sinus;
    }
    public void printParallelogram() {
        this.coloredVector1.printColoredVector();
        this.coloredVector2.printColoredVector();
    }
}
