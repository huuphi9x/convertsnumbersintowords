import java.util.Scanner;

public class ConvertsNumbersIntoWords {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] words = {"Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", ""};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number? ");
        int number = scanner.nextInt();
        if (number < 10) {
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    System.out.println(words[i]);
                }
            }
        } else if (number < 20) {
            for (int i = 0; i < numbers.length; i++) {
                if (number % 10 == numbers[i]) {
                    System.out.printf("Mười %s", words[i]);
                }
            }
        }
    }
}