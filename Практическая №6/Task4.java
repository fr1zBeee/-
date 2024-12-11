
public class Task4 {
    public static void main(String[] args) {
        int step = 1; // шаг 1 градус
        System.out.printf("%-10s%-10s\n", "Degree", "Sine");
        for (int degree = 0; degree <= 90; degree += step) {
            System.out.printf("%-10d%-10.4f\n", degree, Math.sin(Math.toRadians(degree)));
        }
    }
}
