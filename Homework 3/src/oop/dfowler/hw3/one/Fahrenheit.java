package oop.dfowler.hw3.one;

import java.text.DecimalFormat;
/**
 * The Fahrenheit Class :For each temperature object,
 * store representations of the temperature Fahrenheit.
 * The constructor and setter perform all the conversions.
 *
 * @author Donovan Fowler
 * @version hw 3, #1
 */
public class Fahrenheit extends Temperature {
    Fahrenheit(double temp){
        setDegrees(temp);
    }

    @Override
    double getKelvin() {
        return 5*(Math.max(getDegrees(),-459.67)  + 459.67)/9;
    }

    @Override
    double getFahrenheit() {
        return getDegrees();
    }

    @Override
    double getCelsius() {
        return 5 * (Math.max(getDegrees(),-459.67) - 32)/9;
    }
    @Override
    public String toString() {
        DecimalFormat output = new DecimalFormat ("0.00");
        return output.format(getDegrees()) + " Degrees Fahrenheit";
    }
}