// importantiong of Sacnner to be used in the program
import java.util.Scanner;

public class GradeBook{
    // method main Begains Execution of Java Program
    public static void main(String [] args){
        // creating a new Instance of the Scanner Class
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int first_number;
        int second_number;
        int sum;

        //Collect First Input from the user
        System.out.print("Enter First Number: ");
        first_number = input.nextInt();
        System.out.print("Enter Second Number: ");
        second_number = input.nextInt();

        sum = first_number+second_number;

        // Displaying out the result:
        System.out.printf("The Sum is: %d\n", sum);
    }
}
