import java.util.*;

public class Arrays {
    public static void main(String[] args) {
//        int  marks [] = new int[5];
//        marks[0] = 90;
//        marks[1] = 80;
//        marks[2] = 70;
//        marks[3] = 60;
//        marks[4] = 50;
////        System.out.println(marks[0]);
//        for(int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
// taking input from user
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int number [] = new int[size];
// input
        for(int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
// output
        for(int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }


    }
}
