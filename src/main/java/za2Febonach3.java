import java.util.Scanner;

public class za2Febonach3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер члена ряда Фибоначчи: ");
        double n = scanner.nextDouble();

        if (n < 0 || n % 1 != 0) {
            System.out.println("Не верное значение");
        } else {
            long fib = fibonacci((int) n);
            System.out.printf("Член ряда Фибоначчи номер %d равен %d", (int) n, fib);
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}