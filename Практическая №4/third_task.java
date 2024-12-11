
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа N от пользователя
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        System.out.println("Простые числа в диапазоне от 1 до " + N + ":");

        // Цикл для проверки всех чисел от 2 до N
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;

            // Проверка, является ли число простым
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // Если делится нацело, то число не простое
                    break;
                }
            }

            // Если число простое, выводим его
            if (isPrime) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
