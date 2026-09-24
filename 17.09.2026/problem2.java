//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class problem2 {
    public static void main(String[]args){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the radious : ");
        double radious = user_input.nextDouble();

        double area = Math.PI * radious * radious;
        double perimeter = 2 * Math.PI * radious;

        System.out.print("\nArea : "+area);
        System.out.print("\nPerimeter : "+perimeter);

        user_input.close();
    }
}
