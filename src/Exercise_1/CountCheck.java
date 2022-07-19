package Exercise_1;
import java.util.*;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class CountCheck {
    public static int CheckNum(int n){
        if (n>0) {
            return 1;
        } else if (n<0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();
        if (CheckNum(n) == 1) {
            System.out.println("Positive");
        } else if (CheckNum(n) == -1) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }
}
