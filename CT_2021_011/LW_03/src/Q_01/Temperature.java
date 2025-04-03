package Q_01;

public class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0.00;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }

    public double toCelsius() {
        return celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5.0 / 9.0;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
