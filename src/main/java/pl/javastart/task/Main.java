package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        boolean isEven = calculator.isEven(5);
        System.out.println("Czy liczba jest parzysta? " + isEven);
        boolean isOdd = calculator.isOdd(4);
        System.out.println("Czy liczba jest nieparzysta? " + isOdd);
        double circleArea = calculator.circleField(4.3);
        System.out.println("Pole koła wynosi: " + circleArea);
        int power = calculator.power(3);
        System.out.println("Wskazana liczba podniesiona do kwadratu to: " + power);
        
    }
}
