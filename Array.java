import java.util.Scanner;

public class Array {
    public static void main(String[] args){

        //Array is the collection of elements of similar datatypes. (reference and index)



        //1. at first simple array   2. array and scanner   3. array and loop


        int[] a; //array reference variable declartion
        a = new int[10]; // new -> dynamic memory allocation (2-4 bytes * 10 = 20 to 40 bytes) and creates
                        //variable from a0-a9
        a[1] = 10;
        a[0] = 20;
        a[9] = 90;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[9]);


        /*
        datatype[] variable name ;
        variable_name =  new datatype][size]

        or

        datatype[] variable_name = new datatype[size];
        */



        float[] x = new float[7]; //-> creates variables from x0-x6

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the input value: ");
        x[5] = sc.nextFloat();

        x[0] = 01;
        x[1] = 11;
        x[6] = 60;
        System.out.println("\nThe input value is: " + x[5]);

        System.out.println("\n" + x[0]);
        System.out.println(x[6]);


       double[] weight = new double[5];
       Scanner ab = new Scanner(System.in);

       for (int i=0;i<5;i++) {
           System.out.println("Enter the weight for pos: " + i);
           weight[i] = ab.nextDouble();
       }

       for(int i=0;i<5;i++){
           System.out.println("The weight at position " + i + " is " + weight[i]);
        }

       sc.close();  //it is a good programming concept to close the scanner when not used
        ab.close();


       }

    }

