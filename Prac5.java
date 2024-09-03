public class Prac5 {
    public static void main(String[] args) {

        // Declare and initialize a variable representing temperature in degrees centigrade
        double centigrade = 36.8;

        // Declare a variable to store temperature in degrees Fahrenheit
        double fahrenheit;

        // Convert temperature from degrees centigrade to degrees Fahrenheit using the given formula
        // Fahrenheit = (9/5) * Centigrade + 32
        fahrenheit = 9.0 / 5.0 * centigrade + 32.0;

        // Print the converted temperature in both degrees centigrade and degrees Fahrenheit
        System.out.println(centigrade + " degrees centigrade = " +
                fahrenheit + " degrees Fahrenheit");
    }
}

