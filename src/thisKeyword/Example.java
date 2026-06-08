package thisKeyword;

class Box {
    //Instance variable .
    private int l,b,h ;

    //Instance member function
    //Name of local variable and instance variable are same that's why we use this keyword

     public void setDimensions (int l ,int b, int h )/* Local variable */{
         this.l=l;
         this.b=b;
         this.h=h;
    }
}

public class Example {
    //static member function
    public static void main(String[] args){
        Box b1 = new Box();
        b1.setDimensions(12,10,8);
    }
}