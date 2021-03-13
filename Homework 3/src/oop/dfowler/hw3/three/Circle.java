package oop.dfowler.hw3.three;
/**
 * The Circle Class : Circle has three attributes: center coords of the circle (x,y) and the radius,
 * all those variables are set as private type. user only can use getter and setter to change the data
 * this class has 4 methods: calculating diameter area, perimeter,distance of circle center to the origin,
 * and determine whether a point is inside the circle.
 *
 * @author Donovan Fowler
 * @version hw 3, #3
 * @bugs None
 */
public class Circle extends Shape {
    private Point center;
    private double radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = Math.abs(radius);
    }
    public double diameter() {
        return radius*2;
    }

    @Override
    public double width() {
        return this.radius;
    }

    @Override
    public double height() {
        return this.radius;
    }

    public double area() {
        return radius*radius*Math.PI;
    }

    public double perimeter() {
        return diameter() * Math.PI;
    }

    public boolean inBounds (Point a) {
        return ((a.getX() - this.getCenter().getX()) < this.radius
                && (a.getY() - this.getCenter().getY()) < this.radius);
    }
    public Rectangle getBoundingBox() {
        Point lowerLeft = new Point ((getCenter().getX() - radius), (getCenter().getY() - radius));
        Point upperRight = new Point ((getCenter().getX() + radius), (getCenter().getY() + radius));
        return new Rectangle(lowerLeft, upperRight);
    }
}
