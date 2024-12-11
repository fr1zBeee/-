
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую дату (день.месяц.год):");
        String date1 = scanner.nextLine();
        System.out.println("Введите вторую дату (день.месяц.год):");
        String date2 = scanner.nextLine();

        String[] parts1 = date1.split("\.");
        String[] parts2 = date2.split("\.");

        int day1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int year1 = Integer.parseInt(parts1[2]);

        int day2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int year2 = Integer.parseInt(parts2[2]);

        if (year1 < year2 || (year1 == year2 && month1 < month2) || (year1 == year2 && month1 == month2 && day1 < day2)) {
            System.out.println("Первая дата раньше второй.");
        } else if (year1 > year2 || (year1 == year2 && month1 > month2) || (year1 == year2 && month1 == month2 && day1 > day2)) {
            System.out.println("Вторая дата раньше первой.");
        } else {
            System.out.println("Даты одинаковы.");
        }

        scanner.close();
    }
}
