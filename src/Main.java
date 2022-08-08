import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0,j=0,sum=0,i;
        System.out.print("enter the number of values that you want to sum : ");
        n = sc.nextInt();
        for (i=0;i<n;i++){
            System.out.print("enter the value of j :");
            j=sc.nextInt();
            sum=sum+j;
        }
        System.out.println("the sum is : "+sum);
    }
}