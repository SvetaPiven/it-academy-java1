public class Task4 {
    public static void main(String[] args) {
        int num1 = 1;
        String longText = "";
        while (num1 <= 10) {
            int num2 = 1;
            while (num2 <= 10) {
                int mulTable = num1 * num2;
                longText = num1 + " * " + num2 + " = " + mulTable;
                switch (longText.length()) {
                    case 9:
                        System.out.print(longText + "      ");
                        break;
                    case 10:
                        System.out.print(longText + "     ");
                        break;
                    case 11:
                        System.out.print(longText + "    ");
                        break;
                    case 13:
                        System.out.print(longText + "  ");
                        break;
                }
                num2++;
            }
            System.out.println();
            num1++;
        }
    }
}