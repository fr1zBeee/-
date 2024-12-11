import java.util.Scanner;

public class Task2Variant4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення значень a, b користувачем
        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();

        // Введення x користувачем
        System.out.print("Введіть x: ");
        double x = scanner.nextDouble();

        // Обчислення f(x)
        double f;
        if (x >= 0 && x <= 4) {
            f = Math.cos(x);
        } else if (x == 4) {
            f = 3 * Math.pow(x, 2) + b * x;
        } else if (x > 4 && x <= 9) {
            f = Math.log(a * x + b);
        } else {
            System.out.println("Значення x не входить в жоден інтервал.");
            return;
        }

        // Вивід результату
        System.out.printf("Результат f(x) = %.4f%n", f);
    }
}