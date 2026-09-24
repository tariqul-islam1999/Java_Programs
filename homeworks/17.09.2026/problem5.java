// Write a Java Program to find factorial of a number using loops.

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int value = user_input.nextInt();

        int factorial=1;
        for(int i = 1;i <= value; i++){
            factorial *= i;
        }
        System.out.print("Factorial of "+value+" : "+factorial);
        user_input.close();
    }
}
