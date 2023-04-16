import java.util.Scanner;
public class za1SredArifmet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.printf("Введите число %d: ", i + 1);
            double number = scanner.nextDouble();
            sum += number;
        }
        double average = sum / count;
        System.out.printf("Среднее арифметическое: %.2f", average);
    }
}