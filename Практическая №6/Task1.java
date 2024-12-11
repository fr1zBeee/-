
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 20; // размер массива
        int[] array = new int[size];
        Random random = new Random();

        // Генерация массива
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // случайные числа от 0 до 99
        }

        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
