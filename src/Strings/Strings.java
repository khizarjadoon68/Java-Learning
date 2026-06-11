package Strings;

public class Strings {
    public static void main(String[] args){
       // String declaration .
       /*
       String name =  "Khizar" ;
       String fullName =  "Khizar Ali" ;
       String sentance =  "My name is Khizar Ali" ;
       */

        //How to take String input from Users .
        // Object of Scanner Class for to take input .
        /*

        System.out.println("Enter Your Name :");
        String name = sc.nextLine();
        System.out.println("Your Name Is : "+name);
         */

        // Function / Methods in String .
        // 1) Concatenation .
        /*
        String firstName = "Khizar";
        String lastName = "Ali";
        String fullName = firstName +" "+lastName;
        System.out.println(fullName);
         */

        // 2) Length
        /*String name = "Khizar Ali";
        System.out.println(name.length());
         */

        // 3)Compare
        /*
        String name1 = "Khizar Ali";
        String name2 = "Khizar Ali";

        // s1>s2 : +ve value
        // s1==s2 : 0 value
        // s1<s2 : -ve value

        if (name1.compareTo(name2) == 0){
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("S
         */

        //Case conversion
        //To convert upper and lower case we need to store it another String .
        // Case Conversion never change the origional String .
        /*
        String name = "Khizar Ali";
        String name2 = name.toUpperCase();
        System.out.println(name2);
        name2 =name.toLowerCase();
        System.out.println(name2) ;
        */

    }
}