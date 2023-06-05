import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octal = scanner.nextLine().trim();

        int decimal = 0;
        for (int i = 0; i < octal.length(); i++) {
            int digit = Character.getNumericValue(octal.charAt(i));
            decimal += digit * Math.pow(8, octal.length() - i - 1);
        }

        System.out.println(decimal);
    }
}