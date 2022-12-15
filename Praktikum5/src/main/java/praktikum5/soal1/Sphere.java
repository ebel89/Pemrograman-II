package praktikum5.soal1;

public class Sphere extends Shape {

    private double radius;

    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;

    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;

    }

}
