import java.util.Scanner;
public class za5KolSlov4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        System.out.println("Введите искомое слово:");
        String word = scanner.nextLine();

        int count = 0;
        String[] words = inputString.split("\\W+");
        for (String w : words)
        {
            if (w.equalsIgnoreCase(word))
            {
                count++;
            }
        }
        System.out.println("Слово \"" + word + "\" встречается в строке \"" + inputString + "\" " + count + " раз(а)");
    }
}