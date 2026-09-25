// Write a Java Program to find the largest of three numbers using if-else.

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the 1st value : ");
        int val1 = user_input.nextInt();
        System.out.print("Enter the 2nd value : ");
        int val2 = user_input.nextInt();
        System.out.print("Enter the 3rd value : ");
        int val3 = user_input.nextInt();

        if (val1>val2 && val1>val3){
            System.out.print(val1+" is Largest");
        }
        else if (val2>val1 && val2>val3) {
            System.out.print(val2+" is Largest");
        }
        else{
            System.out.print(val3+" is Largest");
        }
        user_input.close();
    }
}
