package sumDigits;

import java.util.Scanner;

public class sumOfDigits {

    public static void main(String[] args) {
        int value;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wartość liczb do zsumowania: ");
        value = sc.nextInt();
        while (value != 0) {
            sum += value%10;
            value /= 10;
        }

        System.out.println("Suma liczb wynosi: " + sum);
        sc.close();
    }
}
