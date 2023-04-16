import java.util.Scanner;

public class za10Simpson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите начальную границу интегрирования: ");
        double a = input.nextDouble();

        System.out.print("Введите конечную границу интегрирования: ");
        double b = input.nextDouble();

        System.out.print("Введите количество разбиений: ");
        int n = input.nextInt();

        double h = (b - a) / n;
        double sum1 = 0, sum2 = 0;

        for (int i = 1; i <= n / 2; i++) {
            double x = a + (2 * i - 1) * h;
            sum1 += Function(x);
        }

        for (int i = 1; i <= n / 2 - 1; i++) {
            double x = a + 2 * i * h;
            sum2 += Function(x);
        }

        double integral = (h / 3) * (Function(a) + Function(b) + 4 * sum1 + 2 * sum2);
        System.out.println("Значение интеграла: " + integral);
    }
    public static double Function(double x) {
        return Math.sin(x);
    }
}