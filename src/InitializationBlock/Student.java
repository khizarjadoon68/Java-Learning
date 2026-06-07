package InitializationBlock;

public class Student {

    // Instance Initialization Block .
    //It automatically run's when the object of this class created .
        {
            System.out.println("Object is being created");
        }
    // Constructor .
    Student() {
            System.out.println("Constructor Called");
        }

        public static void main(String[] args) {
            //Object Created .
            Student s1 = new Student();
        }

}

