package Exercise_1;
import java.util.*;

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

public class SquareNumbers {
    public static double SquareNum(int x, int n) {
        double result = Math.pow(x, n);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("The result is: " + SquareNum(x, n));
    }
}
