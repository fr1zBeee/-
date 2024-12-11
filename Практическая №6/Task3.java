
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the index of the element to replace:");
        int index = scanner.nextInt();
        System.out.println("Enter the new value:");
        int newValue = scanner.nextInt();

        if (index >= 0 && index < size) {
            array[index] = newValue;
            System.out.println("Updated array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}
