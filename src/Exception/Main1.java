package Exception;

//Our throw and default catch
/*
public class Threads.Main1 {
    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("You are not eligible");
        }

        System.out.println("Eligible");
    }
}
*/

//Our throw and Our catch
public class Main1 {
    public static void main(String[] args) {

        try {
            int age = 15;

            if (age < 18) {
                throw new ArithmeticException("Not Eligible");
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

