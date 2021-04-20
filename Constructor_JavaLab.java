class Details{
    String name;
    int weight, age;

    Details(){          //constructor with no parameter
        age = 5;
        weight = 10;
      }

    Details(int umer){      //constructor with one parameter
        age = umer;
        weight = 20;
    }

    Details(int ag, int weigh){        //constructor with two parameters
        age = ag;
        weight = weigh;
    }
    //display method
    void display(){
        System.out.println("Weight at age "+ age + " is " + weight );
    }


}

public class Constructor_JavaLab {
    public static void main(String[] args){
        Details d1 = new Details();                      //object d1
        Details d2 = new Details(10);             //object d2
        Details d3 = new Details(20,70);     //object d3

        //Displaying using display method
        d1.display();
        d2.display();
        d3.display();

    }

}
