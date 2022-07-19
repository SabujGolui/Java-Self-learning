package Exercise_1;
import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.

public class CircleCircumference {
    public static double circleCircumference(int radius) {
        double circumference = (2 * radius * 3.14);
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radios: ");
        int radius = sc.nextInt();
        System.out.println("The circumference of a circle with radius " + radius + " is " + circleCircumference(radius));
    }
}
