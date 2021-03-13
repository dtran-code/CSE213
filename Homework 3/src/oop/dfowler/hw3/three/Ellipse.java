package oop.dfowler.hw3.three;
/**
 * Ellipse class Create a subclass of Circle:
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */
public class Ellipse extends Circle {
    private double minorRadius;

    public double getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    public Ellipse() {
        super();
        this.minorRadius = super.getRadius();
    }
    public Ellipse(Point center, double radius, double mRadius) {
        super(center,radius);
        this.minorRadius = mRadius;
    }

    @Override
    public double width() {
        return this.getRadius()*2;
    }
    @Override
    public double height() {
        return this.getMinorRadius()*2;
    }
    @Override
    public double area() {
        return Math.PI*this.getRadius()*this.getMinorRadius();
    }
    @Override
    public double perimeter() {
        return Math.sqrt(2)*Math.PI*Math.sqrt(this.getRadius()*this.getRadius() + this.getMinorRadius()*this.getMinorRadius() );
    }
    @Override
    public boolean inBounds(Point a) {
        double h = this.getCenter().getX();
        double k = this.getCenter().getY();
        double x = a.getX();
        double y = a.getY();
        return (x - h) * (x - h) / (this.getRadius() * this.getRadius()) + (y - k) * (y - k) / (this.getMinorRadius() * this.getMinorRadius()) <= 1;
    }
    public Rectangle getBoundingBox() {
        Point upperRight = new Point(this.getCenter().getX()+this.getRadius(),this.getCenter().getY()+this.getMinorRadius());
        Point lowerLeft = new Point(this.getCenter().getX()-this.getRadius(),this.getCenter().getY()-this.getMinorRadius());
        return new Rectangle(upperRight,lowerLeft);
    }

    public double focalDistance(){
        return(Math.sqrt(Math.abs((this.getRadius()* this.getRadius())-(this.getMinorRadius()* this.getMinorRadius()))));
    }
    public double Diameter() {
        return Math.max(this.width(),this.height());
    }
    public double eccentricity(){
        double focal= this.focalDistance();
        double ec= focal/Math.max(this.getRadius(),this.getMinorRadius());
        return(ec);
    }

}
