import java.util.Scanner;

public class Task1Variant4 {
    public static void main(String[] args) {
        // Значення констант
        double a = 1.256;
        double b = 13.5;
        double c = 4;

        // Обчислення x
        double x = Math.pow(c, 1.0 / 3.0) + Math.pow(a, b + 1) + (a + b / 2) / (2 * a + b);

        // Обчислення y
        double y = (a + 1) * (1 / Math.sin(a));

        // Вивід результатів
        System.out.printf("Результати для завдання 1, варіант 4:%n");
        System.out.printf("x = %.4f%n", x);
        System.out.printf("y = %.4f%n", y);
    }
}