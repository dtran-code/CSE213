package oop.dfowler.hw3.three.testing;

import oop.dfowler.hw3.three.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * The EllipseTest Class : The test class will contain main method and test Ellipse
 * class with some data.
 *
 * @author Donovan Fowler
 * @version hw 3, #3
 * @bugs None
 */

public class EllipseTest {
    @Test
    public void testEllipseDefaultConstructor() {
        Ellipse e1 = new Ellipse();
        double expectRadius = e1.getRadius();
        double expectMRadius = e1.getMinorRadius();
        double actualRadius = 1;
        double actualMRadius = 1;
        Assert.assertEquals("Actual did not match expected", expectRadius, actualRadius, 0.1);
        Assert.assertEquals("Actual did not match expected", expectMRadius, actualMRadius, 0.1);
    }

    @Test
    public void testEllipseConstructor() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double expectRadius = e1.getRadius();
        double expectMRadius = e1.getMinorRadius();
        double actualRadius = 3;
        double actualMRadius = 1;
        Assert.assertEquals("Actual Radius did not match expected", expectRadius, actualRadius, 0.1);
        Assert.assertEquals("Actual M Radius did not match expected", expectMRadius, actualMRadius, 0.1);
        Assert.assertEquals("Actual did not match expected", e1.getCenter().getX(), a.getX(), 0.1);
        Assert.assertEquals("Actual did not match expected", e1.getCenter().getY(), a.getY(), 0.1);
    }
    @Test
    public void testEllipseWidth() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double width = e1.width();
        Assert.assertEquals("Actual did not match expected", width, e1.getRadius()*2, 0.1);
    }
    @Test
    public void testEllipseHeight() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double height = e1.height();
        Assert.assertEquals("Actual did not match expected", height, e1.getMinorRadius()*2, 0.1);
    }
    @Test
    public void testEllipseArea() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double area = e1.area();
        Assert.assertEquals("Actual did not match expected",9.42, area, 0.1);
    }
    @Test
    public void testEllipsePerimeter() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double perimeter = e1.perimeter();
        Assert.assertEquals("Actual did not match expected", 13.36, perimeter, 1);
    }
    @Test
    public void testEllipseInBounds() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        Point b = new Point(2,2);
        Point c = new Point(5,6);
        Assert.assertTrue("Actual Point is not inBound", e1.inBounds(b));
        Assert.assertFalse("Actual Point is inBound", e1.inBounds(c));
    } @Test
    public void testEllipseBoundingBox() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        Rectangle box = e1.getBoundingBox();
        double x1 = box.getUpperRight().getX();
        double y1 = box.getUpperRight().getY();
        double x2 = box.getLowerLeft().getX();
        double y2 = box.getLowerLeft().getY();
        Assert.assertEquals("Actual UpperRight x did not match expected",4 , x1, 0.1);
        Assert.assertEquals("Actual UpperRight y did not match expected", 3, y1, 0.1);
        Assert.assertEquals("Actual LowerLeft x did not match expected", -2, x2, 0.1);
        Assert.assertEquals("Actual LowerLeft y did not match expected", 1, y2, 0.1);
    } @Test
    public void testEllipseFocalLength() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double Focal = e1.focalDistance();
        Assert.assertEquals("Actual did not match expected", 2.828, Focal, 0.01);
    } @Test
    public void testEllipseEccentric() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double e = e1.eccentricity();
        Assert.assertEquals("Actual did not match expected", 0.9428, e, 0.001);
    } @Test
    public void testEllipseDiameter() {
        Point a = new Point(1,2);
        Ellipse e1 = new Ellipse(a,3,1);
        double diameter = e1.diameter();
        Assert.assertEquals("Actual did not match expected", 6, diameter, 0.1);
    }
}