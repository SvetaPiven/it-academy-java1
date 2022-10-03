import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int hour = 24;
        Scanner in = new Scanner(System.in);
        System.out.print("Input hour: ");
        hour = in.nextInt();
        in.close();
        switch (hour) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 24:
                System.out.println("Good night!");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Good morning!");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Good day!");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("Good evening!");
                break;
        }
    }
}