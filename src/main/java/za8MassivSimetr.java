public class za8MassivSimetr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};

        boolean isSymmetric = true; // Флаг, показывающий, является ли массив симметричным

        int length = arr.length;

        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != arr[length - i - 1]) {
                isSymmetric = false;
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Массив симметричный относительно его центра.");
        } else {
            System.out.println("Массив не симметричный относительно его центра.");
        }
    }
}