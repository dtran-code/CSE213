package oop.dfowler.hw3.three;
/**
 * The Point Class: Point has two attributes (x,y), these two variables are set as private type.
 * User can only use getter and setter to change classes. This class has three methods: user
 * can implement a constructorwhich will initialize the new Point to be an exact duplicate of
 * another Point, and two methods to calculate the distance from two points and distance from origin.
 *
 * @author Donovan Fowler
 * @version hw 3, #3
 * @bugs None
 */
import java.text.DecimalFormat;
public class Point {
    private double x;
    private double y;
    private double radius;
    private double angle;

    // Get Set goes here

    // getters and setters for private attributes go here!
    public double getX(){
        return x;
    }

    public void setX(double x) {
        this.x = x;
        this.radius = Math.sqrt(x * x + this.y * this.y);
        this.angle = Math.atan2(this.y, x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        this.radius = Math.sqrt(this.x * this.x + this.y * this.y);
        this.angle = Math.atan2(this.y, this.x);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
        this.x = this.radius * Math.cos(this.angle);
        this.y = this.radius * Math.sin(this.angle);
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
        this.x = this.radius * Math.cos(this.angle);
        this.y = this.radius * Math.sin(this.angle);
    }
    public Point () {
        setX(0);
        setY(0);
        setAngle(0);
        setRadius(0);
    }

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = Math.sqrt(x * x + y * y);
        this.angle = Math.atan2(y, x);
    }

    /**
     * constructorwhich will initialize the new Point to be an exact duplicate of another Point.
     * @param that the other point
     */
    public Point (Point that){
        this.x = that.x;
        this.y = that.y;
        this.angle = that.angle;
        this.radius = that.radius;
    }

    /**
     * calculates
     * the distance from the Point to another Point passed in as an argument.
     * @param that
     * @return double distance
     */
    public double distance(Point that) {
        double xDiff = this.x - that.getX();
        double yDiff = this.y - that.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    /**
     * calculates the Pointdistance from the origin, (0, 0)
     * @return double distance
     */
    public double distanceFromOrigin(){
        return this.radius;
    }

    public int compareTo(Point that) {
        if (this.x == that.x && this.y == that.y) {
            return 0;
        }
        else if (this.x < that.x && this.y < that.y){
            return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        DecimalFormat output = new DecimalFormat("0.0");
        return String.format("(" + output.format(this.x) + ", " + output.format(this.y) + ")");
    }
}
