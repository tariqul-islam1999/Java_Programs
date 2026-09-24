// Write a Java program to determine whether user input is even or odd
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int value = user_input.nextInt();

        for(int i = 0; i <= value; i++){
            if (i%2 == 0){
            System.out.println(i+" is EVEN");
            }
            else{
            System.out.println(i+" is ODD");
            }
        }

       
        user_input.close();
    }
}
