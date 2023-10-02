package pl.javastart.task;

public class Calculator {

    boolean isEven(int num) {

        boolean isEven = num % 2 == 0;
        return isEven;
    }

    boolean isOdd(int num) {
        boolean isOdd = num % 2 != 0;
        return isOdd;
    }

    double circleField(double r) {
        double area = 3.14 * r * r;
        return area;
    }

    int power(int num) {
        int result = num * num;
        return result;
    }
}
