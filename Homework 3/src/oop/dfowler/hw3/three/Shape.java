package oop.dfowler.hw3.three;

/**
 * Shape class organize the code to create a class hierarchy
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */

public abstract class Shape {

    public abstract double width();
    public abstract double height();
    public abstract double area();
    public abstract double perimeter();
    public abstract boolean inBounds(Point a);
}
