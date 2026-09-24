// Write a Java Program to print Fibonacci Series using loop.

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int value = user_input.nextInt();

        int first_val = 0;
        int second_val = 1;

        for (int i=1; i<=value; i++){
            System.out.print(first_val);
            int next_val = first_val+second_val;
            first_val = second_val;
            second_val = next_val;
        }
        user_input.close();
    }
}
