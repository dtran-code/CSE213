package oop.dfowler.hw3.three;
/**
 * The Rectangle Class : Rectangle has four attributes: coordinates of lower left corner (x,y) and
 * coordinates of upper right corner (x2,y2). All those variables are set as private type. user only
 * can use getter and setter to change the data. This class has 6 methods: calculating width, height,
 * area, perimeter,distance of lower left corner to the origin, and determine whether a point is inside the rectangle.
 *
 * @author Donovan Fowler
 * @version hw 3, #3
 * @bugs None
 */
public class Rectangle extends Shape {
    private Point lowerLeft;
    private Point upperRight;

    public Point getLowerLeft() {
        return lowerLeft;
    }

    public Point getUpperRight() {
        return upperRight;
    }

    public Rectangle() {
        this.lowerLeft = new Point();
        this.upperRight = new Point(1,1);

    }

    public Rectangle(double width, double height) {

        this.lowerLeft = new Point();
        this.upperRight = new Point(width,height);
    }

    public Rectangle (Point a, Point b) {
        if (a.compareTo(b) == -1) {
            this.lowerLeft = a;
            this.upperRight = b;
        }
        if (a.compareTo(b) == 1) {
            if (a.getX() > b.getX() && a.getY() > b.getY()) {
                this.lowerLeft = b;
                this.upperRight = a;
            } else if (a.getX() > b.getX() && a.getY() < b.getY()) {
                this.lowerLeft = b;
                this.upperRight = a;
                this.lowerLeft.setY(a.getY());
                this.upperRight.setY(b.getY());
            } else {
                this.lowerLeft = a;
                this.upperRight = b;
                this.lowerLeft.setY(b.getY());
                this.upperRight.setY(a.getY());
            }
        }
    }

    public Point getLowerRight () {
        return new Point(this.upperRight.getX(), this.lowerLeft.getY());
    }

    public Point getUpperLeft () {
        return new Point(this.lowerLeft.getX(), this.upperRight.getY());
    }

    public double width () {
        return this.upperRight.getX() -this.lowerLeft.getX();
    }

    public double height () {
        return this.upperRight.getY() -this.lowerLeft.getY();
    }

    public double area () {
        return height() * width();
    }

    public double perimeter () {
        return (height() + width()) * 2;
    }
    public boolean inBounds (Point a) {
        return (a.getX() <= this.upperRight.getX()
                &&  a.getY() >= this.lowerLeft.getY()
                &&  a.getX() >= this.lowerLeft.getX()
                &&  a.getY() <= this.upperRight.getY()
        );

    }
}
