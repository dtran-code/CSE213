package oop.dfowler.hw3.one;
import java.util.Scanner;
/**
 * This class contains a very simple program that prompts
 * the user for the current temperature, unit and wind speed to calculate WindChill
 *
 * @author Donovan Fowler
 * @version hw 3, #1
 */

public class WindChill {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature> ");
        double t = in.nextDouble();
        System.out.print("Enter the temperature unit [K/C/F]> ");
        String unit = in.next();
        System.out.print("Enter the wind speed (mph)> ");
        double v = in.nextDouble();
        in.close();
        Temperature temp = null;
        switch (unit.toUpperCase()) {
            case "C":
                temp = new Celsius(t);
                break;
            case "K":
                temp = new Kelvin(t);
                break;
            case "F":
                temp = new Fahrenheit(t);
                break;
            default:
                System.err.println("Error Input");
        }
        assert temp != null;
        Fahrenheit t2 = windChill(temp,v);
        System.out.println("Wind Chill Temperature: " + t2.toString());
        Celsius t3 = skinTemperature(temp,v);
        System.out.println("Final Skin Temperature: " + t3.toString());
        frostbiteWarning(temp,v);

    }

    /**
     * method windChill: Calculate the wind chill temperature
     * @param temp temperature
     * @param WindSpeed wind speed
     * @return Temperature
     */
    public static Fahrenheit windChill(Temperature temp, double WindSpeed) {
        double t = temp.getFahrenheit();
        return new Fahrenheit(35.74 + 0.6215 * t - 35.75 * (Math.pow(WindSpeed, 0.16)) + 0.4275 * t * (Math.pow(WindSpeed, 0.16)));
    }

    /**
     * method skinTemperature: Calculate the final skin temperature
     * @param temp temperature
     * @param WindSpeed wind speed
     * @return Temperature
     */
    public static Celsius skinTemperature(Temperature temp, double WindSpeed) {
        Temperature t_wc = windChill(temp,WindSpeed);
        double t = t_wc.getDegrees();
        return new Celsius((0.1 * t  - 2.7883)* Math.log(0.621 * WindSpeed) + 0.2977*t + 19.874);
    }

    /**
     * method frostbiteWarning determine the severity of wind chill
     * @param temp temp
     * @param WindSpeed wind speed
     */
    public static void frostbiteWarning(Temperature temp, double WindSpeed) {
        Celsius t_f = skinTemperature(temp,WindSpeed);
        Fahrenheit t_wc = windChill(temp,WindSpeed);
        if (t_f.getDegrees() < -4.8 ) {
            if (t_wc.getDegrees() <= (7.5 * Math.log(WindSpeed) - 51.4)) {
                System.out.println("Extreme Danger! Get inside within 10 minutes to avoid freezing!");
            } else {
                System.out.println("Warning");
            }
        } else {
            System.out.println("No Danger!!");
        }
    }

}
