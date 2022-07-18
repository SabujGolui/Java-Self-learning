import java.util.*;

public class function {
    //function to print a string and return the string
//    public static void printMyName (String name) {
//        System.out.println(name);
//        return;
//    }

//    // make a function to add two numbers and return the result
//
//    public static int addTwoNumbers(int a, int b) {
//        int result = a + b;
//        return result;
//    }

    // make a function to multiply two numbers and return the result

//    public static int multiplyTwoNumbers(int a, int b) {
//        return a * b;
//    }

        //find the factorial of a number
    public static void factorial(int n) {
        if (n<0) {
            System.out.println("Factorial of negative number is not defined");
        } else if (n==0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        System.out.println("The result is: " + multiplyTwoNumbers(a, b));

//        String name = sc.nextLine();
//        printMyName(name); // calling the function

//        int result = addTwoNumbers(a, b);
//        System.out.println("The result is: " +

        factorial(n);
    }




}
