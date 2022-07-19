package Exercise_1;
import java.util.*;

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class VoteEligibility {
    public static int voteEligibility(int age) {
        if (age > 18) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (voteEligibility(age) == 1) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
