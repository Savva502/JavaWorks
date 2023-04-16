import java.util.Scanner;
public class za6SimvolIzStrok5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        System.out.println("Введите символ, который нужно удалить:");
        char charToDelete = scanner.nextLine().charAt(0);

        String result = inputString.replaceAll(String.valueOf(charToDelete), "");
        System.out.println("Результат: " + result);
    }
}
