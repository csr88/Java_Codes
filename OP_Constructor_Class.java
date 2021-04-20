class Employee {
    String name;
    String address;
    double salary;


    void setEmployee(String n, String ad, double sal) {   //setEmployee method/function
        name = n;
        address = ad;
        salary = sal;
    }

    void display() {        //display method
        System.out.println(name + " " + address + " " + salary);
    }
}

public class OP_Constructor_Class {
    public static void main(String[] args){
        Employee e = new Employee(); // e object created
        System.out.println(e.name); /*calling name from e object and but since we haven't initialized any variable
                                    *the output would be null
                                    */
        e.name = "shishir";
        System.out.println(e.name);

        //another way to initialize the variable is by using method or function



    }
}
