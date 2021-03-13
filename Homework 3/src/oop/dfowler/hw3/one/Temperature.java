package oop.dfowler.hw3.one;

import java.text.DecimalFormat;
/**
 * The Temperature Class :For each temperature object,
 * store all three representations of the temperature (Celsius, Fahrenheit, Kelvin).
 * The constructor and setter perform all the conversions.
 *
 * @author Donovan Fowler
 * @version hw 3, #1
 */
public abstract class Temperature {
    protected double degrees;
    abstract double getKelvin();
    abstract double getCelsius();
    abstract double getFahrenheit();

    public void setDegrees(double temp) {
        this.degrees = temp;
    }
    public double getDegrees() {
        return this.degrees;
    }
    public String toString() {
        DecimalFormat output = new DecimalFormat ("0.00");
        return output.format(this.degrees) + " Degrees";
    }
}
