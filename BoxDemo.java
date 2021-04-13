

class Box{
    int length, breadth, height;
    java.lang.String color;
}
public class BoxDemo {
    public static void main(String[] args){
        // Box mybox; //creating a new Box datatype but it is not given any space or memory
        // mybox = new Box(); //new = dynamic memory
        // a box object called mybox is created here

        Box mybox = new Box();

        mybox.length=10;
        mybox.breadth=15;
        mybox.height=20;
        mybox.color="red";

        System.out.println("The volume of the box is: " + mybox.length* mybox.breadth* mybox.height + "cubic cm.");


        

    }
}
