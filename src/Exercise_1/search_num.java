package Exercise_1;
import java.util.*;

// Take an array as input from user and search for a given number and the number.

public class search_num {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int number [] = new int[size];
        //input
        for(int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        int x =sc.nextInt();

        // output
        for (int i=0;i< number.length;i++){
            System.out.println();
        }

    }
}
