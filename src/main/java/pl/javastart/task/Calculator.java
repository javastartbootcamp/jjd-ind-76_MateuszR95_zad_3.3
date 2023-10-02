package pl.javastart.task;

public class Calculator {

    boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
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
