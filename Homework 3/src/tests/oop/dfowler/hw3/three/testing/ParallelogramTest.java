package oop.dfowler.hw3.three.testing;

import oop.dfowler.hw3.three.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * The ParallellogramTest Class : The test class will contain main method and test Ellipse
 * class with some data.
 *
 * @author Donovan Fowler
 * @version hw 3, #3
 * @bugs None
 */

public class ParallelogramTest {
 @Test
 public void testParallelogramDefaultConstructor() {
     Parallelogram p = new Parallelogram();
     double a = p.getSkewAngle();
     Point x1 = p.getLowerLeft();
     Point x2 = p.getUpperRight();
     Assert.assertEquals("Actual did not match expected", 0, x1.getX(), 0.1);
     Assert.assertEquals("Actual did not match expected", 0, x1.getY(), 0.1);
     Assert.assertEquals("Actual did not match expected", 1, x2.getX(), 0.1);
     Assert.assertEquals("Actual did not match expected", 1, x2.getY(), 0.1);
     Assert.assertEquals("Actual did not match expected", Math.PI/2, a, 0.1);
 }
 @Test
 public void testParallelogramConstructor() {
     Point a = new Point(2,2);
     Point b = new Point(5,7);
     Parallelogram p = new Parallelogram(a,b,3*Math.PI/2);
     double angle1 = p.getSkewAngle();
     Assert.assertEquals("Actual did not match expected", 4.71, angle1, 0.1);

 }
    @Test
    public void testParallelogramBaseLength() {
        Point a = new Point(2,2);
        Point b = new Point(5,7);
        Parallelogram p = new Parallelogram(a,b,Math.PI/2);
        double len = p.baseLength();
        Assert.assertEquals("Actual did not match expected", 3, len, 0.1);
    }
    @Test
    public void testParallelogramLowerRight() {
        Point a = new Point(0,0);
        Point b = new Point(5,5);
        Parallelogram p = new Parallelogram(a,b,Math.PI/2);
        double x = p.getLowerRight().getX();
        double y = p.getLowerRight().getY();
        Assert.assertEquals("Actual did not match expected", -5, x, 1);
        Assert.assertEquals("Actual did not match expected", 0, y, 1);
    }
    @Test
    public void testParallelogramUpperLeft() {
        Point a = new Point(0,0);
        Point b = new Point(5,5);
        Parallelogram p = new Parallelogram(a,b,Math.PI/2);
        double x = p.getUpperLeft().getX();
        double y = p.getUpperLeft().getY();
        Assert.assertEquals("Actual did not match expected", 5, x, 1);
        Assert.assertEquals("Actual did not match expected", 1, y, 1);
    }
    @Test
    public void testParallelogramWidth() {
        Point a = new Point(0,0);
        Point b = new Point(5,5);
        Parallelogram p = new Parallelogram(a,b,Math.PI/2);
        double w = p.Width();
        Assert.assertEquals("Actual did not match expected", 5, w, 1);
    }
    @Test
    public void testParallelogramArea() {
        Point a = new Point(0,0);
        Point b = new Point(5,5);
        Parallelogram p = new Parallelogram(a,b,Math.PI/2);
        double area = p.area();
        Assert.assertEquals("Actual did not match expected", 25, area, 0.1);
    }
    @Test
    public void testParallelogramPeri() {
        Point a = new Point(0,0);
        Point b = new Point(5,5);
        Parallelogram p = new Parallelogram(a,b,Math.PI/2);
        double peri = p.perimeter();
        Assert.assertEquals("Actual did not match expected", 10.3, peri, 0.1);
    }
    @Test
    public void testParallelogramInBounds() {
        Point a = new Point(0,0);
        Point b = new Point(5,5);
        Parallelogram p = new Parallelogram(a,b,Math.PI/2);
        Point c = new Point(2,2);
        Assert.assertFalse("Actual Point is inBound", p.inBounds(c));
}
}