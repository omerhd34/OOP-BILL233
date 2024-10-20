package ADVANCED.Exercises3;

import java.util.Scanner;

public class CircleAreaCalculator {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2); // Formula: π * r^2
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate the area using circleArea method
        double area = circleArea(radius);

        // Display the result
        System.out.printf("The area of the circle with radius %.2f is: %.2f\n", radius, area);
    }
}
/*
Enter the radius of the circle: 5
The area of the circle with radius 5.00 is: 78.54

         CircleAreaCalculator
--------------------------------------

--------------------------------------
+ circleArea(radius: double): double
+ main(args: String[]): void
--------------------------------------

 */
