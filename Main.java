import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double t;
    CelsiusTemperature temperature;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a temperature in Celsius: ");
    t = input.nextDouble();
    temperature = new CelsiusTemperature(t);

    System.out.println(t + " degrees celsius is " +
                       temperature.getFahrenheit() +
                      " Fahrenheit");
  }
}