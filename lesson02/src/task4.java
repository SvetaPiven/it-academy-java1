import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("Input number: ");
        number = in.nextInt();
        in.close();
        int x = number / 100;
        int y = number % 10;
        int z = (number / 10) %10;
        System.out.println("Result = " + (x + y + z));
    }
}
