class TemperatureAdapter implements ITemperature {
    private TemperatureAdaptee converter;

    public TemperatureAdapter() {
        this.converter = new TemperatureAdaptee();
    }

    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
        return converter.convertCelsiusToFahrenheit(celsius);
    }

    @Override
    public double convertCelsiusToKelvin(double celsius) {
        return converter.convertCelsiusToKelvin(celsius);
    }

    @Override
    public double convertFahrenheitToCelsius(double fahrenheit) {
        return converter.convertFahrenheitToCelsius(fahrenheit);
    }

    @Override
    public double convertFahrenheitToKelvin(double fahrenheit) {
        return converter.convertFahrenheitToKelvin(fahrenheit);
    }

    @Override
    public double convertKelvinToCelsius(double kelvin) {
        return converter.convertKelvinToCelsius(kelvin);
    }

    @Override
    public double convertKelvinToFahrenheit(double kelvin) {
        return converter.convertKelvinToFahrenheit(kelvin);
    }
}