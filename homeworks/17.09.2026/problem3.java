//Write a Java program to swap two variables without using third variable.

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = user_input.nextInt();
        System.out.print("Enter b : ");
        int b = user_input.nextInt();

        System.out.print("Before Swapping : a = "+a+" ; b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print("\nAfter Swapping : a = "+a+" ; b = "+b);
        user_input.close();
    }
}
