package Exception;

//It is the process of handling runtime errors and maintain the normal flow of a program .
public class Main {
    public static void main(String[] args){
        //In try we need to Write dependent code .
        try {
            System.out.println(3/0);
            System.out.println("In try"); // This line never executed . Because in first line we have a runtime exception .
        }
        catch (ArithmeticException e){
            System.out.println("Exception : " +e.getMessage());

        }
        System.out.println("Hello");
    }
}