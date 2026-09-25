// Write a Java Program to check if number is positive or negative.

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the 1st value : ");
        int value = user_input.nextInt();

        if (value>0){
            System.out.println(value+" is Positive");
        }
        else{
            System.out.println(value+" is Negetive");
        }
        user_input.close();
    }
}
