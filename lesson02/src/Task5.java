import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextDouble();
        if (x % 1 == 0) {
            System.out.println("Whole");
        } else {
            System.out.println("No whole");
        }
    }
}