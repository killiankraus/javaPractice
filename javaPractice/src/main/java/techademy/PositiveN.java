package techademy;

import java.util.Scanner;

public class PositiveN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i * 2;
                System.out.print(sum + " ");
            }
        } else {
            System.out.println("Wrong input");
        }
    }
}
