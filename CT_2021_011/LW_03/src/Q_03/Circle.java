
package Q_03;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double computeCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}