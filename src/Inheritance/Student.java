package Inheritance;

//Inheritance
class Student extends Person {
    // Properties
    private  int roll_no ;

    //Methods
     public void setRoll_no(int r) {
         roll_no = r;
     }

     public int getRoll_no(){
         return (roll_no);

     }
 }