package ClassObject;

class Box {
    // Properties / Instance Member variable
    private int length, breadth, height;

    //Methods // Instance member functions
    public void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void showDimension() {
        System.out.println("l=" + length);
        System.out.println("b=" + breadth);
        System.out.println("h=" + height);

    }

}
class Example {
    public static void main() {
        Box smallBox = new Box(); // Reference variable / Object
        smallBox.setDimension(13, 23, 4);
        smallBox.showDimension();// garbage
        smallBox = new Box(); // New Object
        smallBox.showDimension(); // Show default (0,0,0)
    }
}

