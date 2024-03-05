public class Converter {

    public static void main(String[] args) {
        System.out.println("testi");
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

  public static double convertKelToFar(double kelvin) {
      return (kelvin - 273.15) * 9/5 + 32;
  }

}

