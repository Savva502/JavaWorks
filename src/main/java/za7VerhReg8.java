import java.util.Scanner;
public class za7VerhReg8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        String result = inputText.toUpperCase();

        System.out.println("Результат: " + result);
    }
}