import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ITemperature adapter = new TemperatureAdapter();

        System.out.print("Enter a temperature value followed by its unit (e.g., '10 C' or '32 F'): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        if (parts.length == 2) {
            double value = Double.parseDouble(parts[0]);
            String unit = parts[1];

            if (unit.equals("C")) {
                double fahrenheit = adapter.convertCelsiusToFahrenheit(value);
                double kelvin = adapter.convertCelsiusToKelvin(value);
                System.out.printf("%.2f F\n%.2f K\n", fahrenheit, kelvin);
            } else if (unit.equals("F")) {
                double celsius = adapter.convertFahrenheitToCelsius(value);
                double kelvin = adapter.convertFahrenheitToKelvin(value);
                System.out.printf("%.2f C\n%.2f K\n", celsius, kelvin);
            } else if (unit.equals("K")) {
                double celsius = adapter.convertKelvinToCelsius(value);
                double fahrenheit = adapter.convertKelvinToFahrenheit(value);
                System.out.printf("%.2f C\n%.2f F\n", celsius, fahrenheit);
            } else {
                System.out.println("Invalid unit. Use 'C', 'F', or 'K'.");
            }
        } else {
            System.out.println("Invalid input. Please provide a value and a unit.");
        }
    }
}
