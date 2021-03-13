package oop.dfowler.hw3.one;
/**
 * The Celcius Class :For each temperature object,
 * store representations of the temperature Celsius.
 * The constructor and setter perform all the conversions.
 *
 * @author Donovan Fowler
 * @version hw 3, #1
 */
import java.text.DecimalFormat;

public class Celsius extends Temperature {
    Celsius(double temp){
        setDegrees(temp);
    }

    @Override
    double getKelvin() {
        return Math.max(getDegrees(),-273.15)  + 273.15;
    }

    @Override
    double getCelsius() {
        return getDegrees();
    }

    @Override
    double getFahrenheit() {
        return 1.8 * Math.max(getDegrees(),-273.15) + 32;
    }
    @Override
    public String toString() {
        DecimalFormat output = new DecimalFormat ("0.00");
        return output.format(getDegrees()) + " Degrees Celsius";
    }
}
