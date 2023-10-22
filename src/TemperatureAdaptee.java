class TemperatureAdaptee implements ITemperature {
    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    @Override
    public double convertFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    @Override
    public double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    @Override
    public double convertKelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}