import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int hour = 24;
        Scanner in = new Scanner(System.in);
        System.out.print("Input hour: ");
        hour = in.nextInt();
        in.close();
        if (hour > 4 && hour < 12) {
            System.out.println("Good morning!");
        } else if (hour > 11 && hour < 18) {
            System.out.println("Good day!");
        } else if (hour > 17 && hour < 24) {
            System.out.println("Good evening!");
        } else if (hour < 5 && hour > 0 || hour == 24) {
            System.out.println("Good night!");
        }
    }
}