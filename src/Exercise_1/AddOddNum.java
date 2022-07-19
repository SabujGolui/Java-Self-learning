package Exercise_1;
import java.util.*;

//Write a function to print the sum of all odd numbers from 1 to n.

public class AddOddNum {
    public static int sumOddNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(n): ");
        int n = sc.nextInt();
        System.out.println("The sum of odd numbers from 1 to n is: " + sumOddNum(n));
    }
}
