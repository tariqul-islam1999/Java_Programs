//Write a Java program to print the sum, divide, product of two numbers.
import java.util.*;
class problem1{
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter 1st num : ");
        double num1 = user_input.nextInt();
        System.out.print("Enter 2nd num : ");
        double num2 = user_input.nextInt();

        double sum = num1+num2;
        double product = num1*num2;
        double divide = num1/num2;

        System.out.print("\nSum : "+sum);
        System.out.print("\nProduct : "+product);
        System.out.print("\nDivide : "+divide);

        user_input.close();
    }
}