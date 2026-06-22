package LibrarySystem;

class Student1 {
    public String name ;
    public String reg_no ;

    Student1 (String name , String reg_no){

        this.name = name ;
        this.reg_no = reg_no;
    }
    public void display(){
        System.out.println("Student Name :"+this.name);
        System.out.println("Student Reg_No :"+this.reg_no);

    }

}

class UnderGrad extends Student1{
    UnderGrad(String name , String reg_no){
        super(name , reg_no )  ;

    }
    @Override
    public void display(){
        System.out.println("Student Type : Under_Graduated");
        super.display();
    }
}

class Graduate extends Student1{
    Graduate (String name , String reg_no){
        super(name , reg_no )  ;
    }
    @Override
    public void display(){
        System.out.println("Student Type : Graduated");
        super.display();
    }
}

public class Student {
    public static void main(String[] args){
        Graduate g1 = new Graduate("khizar" , "B23Fo283SE071");
        UnderGrad u1 = new UnderGrad("Taha" , "B23FO181AI725");

        g1.display();
        u1.display();
    }
}