import java.util.*;

public class adpatterns {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of rows: ");
        n = sc.nextInt();

//        // butterfly pattern
//        //upper half
//        for (int i=1;i<=n;i++){
//            //first part
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            // spaces
//            int space = 2*(n-i);
//            for (int j=1; j<=space;j++){
//                System.out.print(" ");
//            }
//            // 2nd part
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//        // lower half
//        for (int i=n;i>=1;i--){
//            //first part
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            // spaces
//            int space = 2*(n-i);
//            for (int j=1; j<=space;j++){
//                System.out.print(" ");
//            }
//            // 2nd part
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();

//        // solid rhombus
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        // number pyramid
//
//        for (int i=1;i<=n;i++){
//            // print spaces
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            // print row no, row times
//            for (int j=1;j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

            // palindromic pattern

//          for (int i=1;i<=n;i++) {
//              for (int j = 1; j <= n - i; j++) {
//                  System.out.print(" ");
//              }
//              // 1st half numbers
//              for (int j=i;j>=1;j--){
//                  System.out.print(j);
//              }
//              //2nd half number
//              for (int j=2;j<=i;j++){
//                  System.out.print(j);
//              }
//              System.out.println();
//          }

//        // diamond pattern (1)
//                // upper half
//            for (int i=1;i<=n;i++){
//                //print spaces
//                for (int j=1;j<=n-i;j++){
//                    System.out.print(" ");
//                }
//                // print stars
//                for (int j=1;j<=2*i-1;j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//            // lower half
//        for (int i=n;i>=1;i--){
//            //print spaces
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            // print stars
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // diamond pattern (2)
        // upper half
        for (int i=1;i<=n;i++){
            //print spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // print stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i=n-1;i>=1;i--){
            //print spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // print stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
