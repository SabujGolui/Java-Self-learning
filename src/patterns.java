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

//        //print half pyramid
//        //column value isn't needed
//        for (int i=1;i<=n;i++){
//            //inner loop
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

//        // INVERTED half pyramid
//
//        for (int i=n;i>=1;i--){
//            //inner loop
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        // half pyramid (180 degree)

//        for (int i=1;i<=n;i++){
//                //inner loop for space print
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            //inner loop for star print
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // half pyramid with number

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }
//
//        // inverted half pyramid with number
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        // floyd's triangle
//
//        int number =1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//            }
//            System.out.println();
//        }

        // 0-1 triangle

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if (sum%2 ==0){ //even
                    System.out.print("1");
                }else { //odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }



    }

}
