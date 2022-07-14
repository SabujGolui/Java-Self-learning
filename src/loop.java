import java.util.*;

//loop basics (for, while, do while)

public class loop {
    public static void main(String[] args) {

        // for ( int i=0; i<11; i++){
        // System.out.println(i);
        // // System.out.print(i + " ");
        // }

        // int i=0;
        // while(i<11){
        // System.out.println(i);
        // i=i+1; // i++
        // }

        // the function will return value single time even if the condition is false

        // int i=0;
        // do{
        // System.out.println(i);
        // i++;
        // } while(i<11);

        // print the sum of 1st "n" natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 0; i <= n; i++) {
        //     sum = sum + i;
        // }

        // System.out.println(sum);

        // print the table of a number input by the user.

        for (int i=1;i<11;i++){
            System.out.println(i*n);
        }

    }

}