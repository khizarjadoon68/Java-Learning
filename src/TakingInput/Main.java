package TakingInput;//It is a predefined class in java used for taking input from users.
import java.util.Scanner;

public class Main {
    public static void main(){

        System.out.println("Taking input From the user");
        //To take input first we create object of Scanner class .
        Scanner sc = new Scanner(System.in);

        //this is use for output .
        System.out.println("Enter First Number :");

        // nextInt() is a function of Scanner Class .
        // Here we store the keyboard value in int a .
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b= sc.nextInt();
        int sum = a+b;

        //Output of values .
        System.out.println("First Number is :"+a );
        System.out.println("Second Number is :"+b );
        System.out.println("Sum of these values is :"+sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}
