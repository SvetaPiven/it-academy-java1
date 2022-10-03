import java.sql.SQLOutput;

public class Task3 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        System.out.println(num1);
        while (num1 <= 10) {
            num1 = num2;
            num2 = result;
            result = num1 + num2;
            System.out.println(result);
        }
    }
}