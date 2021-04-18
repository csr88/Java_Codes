class Boxdemo_Class {

    //Boxdemo

    int length, breadth, height;
    String color;

    //define some methods
    void volume() {
        int vol1 = length * breadth * height;
        System.out.println("Volume= " + vol1);
    }
    //now when called this volume method/function, the code inside the volume will be executed.
}
//setD
class Boxdemo{
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.length = 10;
        mybox.breadth = 20;
        mybox.height = 30;
        mybox.color = "red";
        mybox.volume();
        int volume = (mybox.length* mybox.breadth* mybox.height);
        System.out.println("The volume of the box 1 is " + volume + " cubic cm.");

        //create another object of type Box
        Box mybox2 = new Box();
        mybox2.length = 20;
        mybox2.breadth = 19;
        mybox2.height = 25;
        mybox2.volume(); //mybox2 =  object name, volume = function
        //System.out.println("The volume of the box 2 is " + (mybox2.length*mybox2.breadth*mybox2.height) + " cubic cm.");

        Box mybox3;
        mybox3=mybox2;
        mybox3.length=10;
        mybox2.volume();
        //volume=mybox2.length* mybox2.breadth* mybox2.height;
        //System.out.println("THe new volume of box 2 because of mybox3 is: "+ volume + " cubic cm.");


    }
}

