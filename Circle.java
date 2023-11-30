public class Circle {
    private double radius;
    private double area;

    void getRadius(double r) {
        radius = r;

    }

    double computeArea() {
        area = radius * radius * (3.142);
        return area;
    }

}
