import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width;
        int height;
        System.out.print("Input width: ");
        width = in.nextInt();
        System.out.print("Input height: ");
        height = in.nextInt();
        in.close();
        System.out.println("Area: " + width * height);
        System.out.println("Perimeter: " + (width + height) * 2);
    }
}