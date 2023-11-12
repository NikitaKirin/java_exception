package exception;

import java.net.MalformedURLException;
import java.net.URL;

public class Second {

    public static void main(String[] args) {
        try {
            System.out.printf("Результат деления %s на %s = %s\n", 4, 2, divide(4, 2));
            double result = divide(1, 0);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.printf("Cтатус корректности строки '%s' : %s\n", "Hello!",
                    checkStringLength("Hello!", 10));
            checkStringLength("Hello!", 1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.printf("Cтатус корректности url '%s' : %s\n", "https://google.com",
                    validateURL("https://google.com!"));
            validateURL("google.com");
        } catch (MalformedURLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Нельзя делить на ноль!");
        }
        return a / b;
    }

    public static boolean checkStringLength(String text, int maxLength) throws IllegalArgumentException {
        if (text.length() > maxLength) {
            throw new IllegalArgumentException("Превышена максимальная длина строки");
        }
        return true;
    }

    public static boolean validateURL(String urlString) throws MalformedURLException {
        try {
            URL url = new URL(urlString);
        } catch (MalformedURLException e) {
            throw new MalformedURLException("Некорректный URL");
        }
        return true;
    }
}
