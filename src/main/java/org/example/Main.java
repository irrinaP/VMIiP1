package org.example;

public class Main {

    // FizzBuzz: Числа от 1 до 500 с заменой на fizz, buzz или fizzbuzz
    public static String fizzbuzz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "fizz";
        } else if (number % 7 == 0) {
            return "buzz";
        } else {
            return Integer.toString(number);
        }
    }

    // Переворот строки
    public static String reverseStr(String string) {
        String result = "";
        for (int index = string.length() - 1; index >= 0; --index) {
            result = result + string.charAt(index);
        }
        return result;
    }

    // Решение квадратного уравнения
    public static double[] quadraticEquation(double a, double b, double c) throws Exception {
        double D = b * b - 4.0 * a * c;
        if (a == 0) {
            throw new Exception("Это не квадратное уравнение.");
        }
        if (D > 0.0) {
            return new double[]{(-b + Math.sqrt(D)) / (2.0 * a), (-b - Math.sqrt(D)) / (2.0 * a)};
        } else if (D == 0.0) {
            return new double[]{-b / (2.0 * a)};
        } else {
            throw new Exception("Нет вещественных корней.");
        }
    }

    // Вычисление суммы ряда
    public static double sumSeries() {
        double n = 2.0;
        double sum = 0.0;
        double memberSeries;
        do {
            memberSeries = 1.0 / (n * n + n - 2.0);
            sum += memberSeries;
            n += 1.0;
        } while (memberSeries >= Math.pow(10.0, -6.0));
        return sum;
    }

    // Проверка на палиндром
    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        int length = string.length();
        for (int i = 0; i < length / 2; i++) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 1. FizzBuzz
        System.out.println("FizzBuzz results:");
        for (int number = 1; number <= 500; ++number) {
            System.out.println(fizzbuzz(number));
        }

        // 2. Переворот строки "make install"
        String originalString = "make install";
        System.out.println("\nReversed string: " + reverseStr(originalString));

        // 3. Решение квадратного уравнения
        try {
            double[] roots = quadraticEquation(1, -3, 2);  // Пример уравнения: x^2 - 3x + 2 = 0
            System.out.println("\nQuadratic equation roots:");
            for (double root : roots) {
                System.out.println(root);
            }
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        // 4. Вычисление суммы ряда
        double seriesSum = sumSeries();
        System.out.println("\nSum of series: " + seriesSum);

        // 5. Проверка строки на палиндром
        String palindromeString = "level";  // Пример строки для проверки
        if (isPalindrome(palindromeString)) {
            System.out.println("\n" + palindromeString + " is a palindrome.");
        } else {
            System.out.println("\n" + palindromeString + " is not a palindrome.");
        }
    }
}
