package Exercise_1;
import java.util.*;
//Write a function that calculates the Greatest Common Divisor of 2 numbers.
public class GCDCalculation {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
