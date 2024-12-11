
import java.util.Scanner;

public class SentenceCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        int sentenceCount = 0;

        for (char ch : text.toCharArray()) {
            if (ch == '.' || ch == '!' || ch == '?') {
                sentenceCount++;
            }
        }

        System.out.println("Количество предложений: " + sentenceCount);

        scanner.close();
    }
}
