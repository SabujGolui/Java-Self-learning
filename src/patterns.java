import java.util.*;
public class patterns {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of rows: ");
        n = sc.nextInt();
        System.out.print("enter the value of columbus : ");
        m = sc.nextInt();

        // print a rectangle
        //outer loop
//        for (int i=1;i<=n;i++){
           //inner loop
//            for (int j=1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // print rectangle outline

//        for (int i=1;i<=n;i++){
//            //inner loop
//            for (int j=1;j<=m;j++){
//                // cell -> (i,j)
//                if (i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //print half pyramid
        //column value isn't needed
        for (int i=1;i<=n;i++){
            //inner loop
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
