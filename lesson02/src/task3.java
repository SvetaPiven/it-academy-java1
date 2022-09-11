import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius;
        final double Pi = 3.1415926536;
        System.out.print("Input radius: ");
        radius = in.nextInt();
        in.close();
        System.out.println("Area: " + Pi * radius * radius);
        System.out.println("Circumference: " + 2 * Pi * radius);
    }
}

