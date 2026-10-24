
package lab1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Software Evolution and Maintenance - Lab 1");
        System.out.println("Temperature of 25 C in Fahrenheit: "
                + celsiusToFahrenheit(25));
        System.out.println("Ahmed Issam Oqbah 202310876");
    }

    /** Converts degrees Celsius to degrees Fahrenheit. */
    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }
}
