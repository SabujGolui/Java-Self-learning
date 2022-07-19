package Exercise_1;
import java.util.*;

//Write a function which takes in 2 numbers and returns the greater of those two.

public class GreaterNum {
    public static int greaterNum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // or you can use java method Math.max(a, b)
//       Math.max(a, b);
//       return Math.max(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The greater number is: " + greaterNum(a, b));
    }
}
