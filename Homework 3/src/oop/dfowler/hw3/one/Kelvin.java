package oop.dfowler.hw3.one;


import java.text.DecimalFormat;
/**
 * The Kelvin Class :For each temperature object,
 * store representations of the temperature Kelvin.
 * The constructor and setter perform all the conversions.
 *
 * @author Donovan Fowler
 * @version hw 3, #1
 */
public class Kelvin extends Temperature {
    Kelvin(double temperature) {
        setDegrees(temperature);
    }

    @Override
    public double getKelvin() {
        return Math.max(getDegrees(),0);
    }

    @Override
    public double getCelsius() {
        return Math.max(getDegrees(),0) - 273.15;
    }

    @Override
    public double getFahrenheit() {
        return 9*Math.max(getDegrees(),0)/5 -459.75;
    }

    @Override
    public String toString() {
        DecimalFormat output = new DecimalFormat ("0.00");
        return output.format(getDegrees()) + " Degrees Kelvin";
    }
}
