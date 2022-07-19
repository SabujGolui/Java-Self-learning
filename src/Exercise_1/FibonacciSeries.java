package Exercise_1;
import java.util.*;
//Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....
public class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n <=1) {
            return n;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
