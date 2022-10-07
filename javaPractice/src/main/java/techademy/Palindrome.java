package techademy;

public class Palindrome {
    public static void main(String[] args) {
        int n = 75;
        int sum = 0;
        if (n < 11) {
            System.out.println("Invalid input");
        } else {
            for (int i = 11; i <= n; i++) {
                int num = i;
                int rev = 0;
                while (num != 0) {
                    int digit = num % 10;
                    rev = rev * 10 + digit;
                    num /= 10;
                }
                if (i == rev) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
