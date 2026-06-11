package TwoDArrays;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        // This is use for input
        Scanner sc = new Scanner(System.in);

        //we take the input values from users
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Columns");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input rows
        for (int i=0; i<rows ;i++ ){
            //input columns
            for (int j=0 ;j<cols ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}