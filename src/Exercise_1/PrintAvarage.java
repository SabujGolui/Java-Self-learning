package Exercise_1;
import java.util.*;

//Enter 3 numbers from the user & make a function to print their average.

public class PrintAvarage {
        public static int avarage(int a, int b,int c) {
            int result = (a + b + c) / 3;
            return result;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average is: " + avarage(a, b, c));
    }
}
