package oop.dfowler.hw3.three;
/**
 * Parallelogram class Create a subclass of Rectangle:
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */
public class Parallelogram extends Rectangle {
    private double skewAngle;

    public double getSkewAngle() {
        return skewAngle;
    }

    public Parallelogram() {
        super();
        this.skewAngle = Math.PI / 2;
    }

    public Parallelogram(Point a, Point b, double r) {
        super(a, b);
        double y1 = super.getUpperRight().getY();
        double y2 = super.getLowerLeft().getY();
        double x1 = super.getUpperRight().getX();
        double x2 = super.getLowerLeft().getX();
        double temp = Math.atan2(y1 - y2, x1 - x2);
        this.skewAngle = r;
        if (this.skewAngle <= temp & this.skewAngle > Math.PI) {
            this.skewAngle = Math.PI / 2;
        }
    }

    public double baseLength() {
        double x1 = super.getUpperRight().getX();
        double x2 = super.getLowerLeft().getX();
        double y1 = super.getUpperRight().getY();
        double y2 = super.getLowerLeft().getY();
        double len = x1 - x2;
        double height = Math.sin(Math.toRadians(this.skewAngle)) * len;
        double base = height / Math.tan(Math.toRadians(this.skewAngle));
        double temp = Math.atan2(y1 - y2, x1 - x2);
        if (temp > 0) {
            return base;
        } else {
            return -1 * base;
        }
    }

    public Point getLowerRight() {
        double lowRight = super.getLowerLeft().getX() - this.baseLength();
        return new Point(lowRight, super.getLowerLeft().getY());
    }

    public Point getUpperLeft() {
        double upLeft = super.getLowerLeft().getX() + this.baseLength();
        return new Point(upLeft, super.getLowerLeft().getY());
    }

    public double Width() {
        if (this.skewAngle <= Math.PI / 2) {
            return super.width();
        } else {
            return this.getLowerRight().getX() - this.getLowerLeft().getX() + this.baseLength() * 2;
        }
    }

    public double area() {
        double x1 = this.getUpperRight().getX();
        double x2 = this.getLowerLeft().getX();
        double len = x1 - x2;
        double height = Math.sin(this.skewAngle) * len;
        return len * height;
    }

    public double perimeter() {
        double x1 = this.getUpperRight().getX();
        double x2 = this.getLowerLeft().getX();
        double len = x1 - x2;
        double height = Math.tan(Math.toRadians(this.skewAngle)) * len;
        return 2 * (len + height);
    }

    public boolean inBounds(Point a) {
        double x1 = this.getUpperRight().getX();
        double x2 = this.getLowerLeft().getX();
        double y1 = this.getUpperRight().getY();
        double y2 = this.getLowerLeft().getY();
        double len = x1 - x2;
        double height = Math.sin(this.skewAngle) * len;
        double base = height / Math.tan(this.skewAngle);
        if (this.skewAngle < Math.PI / 2) {
            return(a.getY() - y2 <= height / base * (a.getX() - x2) & a.getY() - y1 >= height / base * (a.getX() - x1));
        } else if (this.skewAngle > Math.PI/2) {
            return a.getY() - y2 >= height / base * (a.getX() - x2) & a.getY() - y1 <= height / base * (a.getX() - x1);
        } else {
            return false;
        }
    }
}