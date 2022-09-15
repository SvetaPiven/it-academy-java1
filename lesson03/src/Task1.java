import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    public static final Logger LOGGER = Logger.getLogger(Task1.class.getName());

    public static void main(String[] args) {
        int num = 7;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Input num: ");
            num = in.nextInt();
            in.close();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "ERROR " + e.getMessage());
        }
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}