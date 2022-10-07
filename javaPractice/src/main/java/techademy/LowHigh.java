package techademy;

import java.util.Scanner;

public class LowHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        int min = 0;
        int max = 0;

        if (n >= 3 ) {
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter the value of " + i + ": ");
                int num = sc.nextInt();
                if (i == 1) {
                    min = num;
                    max = num;
                } else {
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
            }
            sum = min + max;
            System.out.println("The sum of the lowest and highest number is " + sum);
        } else {
            System.out.println("Invalid input");
        }
    }
}
