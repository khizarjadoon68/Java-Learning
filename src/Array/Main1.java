import java.util.*;

public static void main() {
    //Array Creation .
    int []arr = new int[5];
    // this is use to to take input from users .
    Scanner sc = new Scanner(System.in);
    //Output .
    System.out.println("Enter 5 numbers");
    // This loop for to take inputs .
    for (int i = 0; i<5 ;i++){
        arr[i] = sc.nextInt();
    }

    //This loop show the data
    for (int i = 0; i<arr.length ;i++){
        System.out.println("arr["+i+"]="+arr[i]);
    }
}