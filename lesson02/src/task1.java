import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.print("Input y: ");
        y = in.nextInt();
        in.close();
        System.out.println(x/y);
        System.out.println(x%y);
    }
}




