
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int hour = 24;
        Scanner in = new Scanner(System.in);
        System.out.print("Input hour: ");
        hour = in.nextInt();
        in.close();
        switch (hour) {
            case 1, 2, 3, 4, 24 -> System.out.println("Good night!");
            case 5, 6, 7, 8, 9, 10, 11 -> System.out.println("Good morning!");
            case 12, 13, 14, 15, 16, 17 -> System.out.println("Good day!");
            case 18, 19, 20, 21, 22, 23 -> System.out.println("Good evening!");
            default -> throw new IllegalStateException("Unexpected value: " + hour);
        }
    }
}