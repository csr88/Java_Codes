import java.util.Scanner;
public class While_FindEvenOddSumMean_JavaLab {
    public static void main (String args[]){
        int r,i;
        Scanner scan=new Scanner(System.in);
//create a scanner object for input
        System.out.print("Enter the limit: ");
        int max=scan.nextInt();//reads max from user
        System.out.print("\nDisplay the even numbers:");
        i=max;
        do{
            r=i%2;
            if(r==0)
                System.out.println(i);
            i++;
        }while(i<=max);
        System.out.print("\nDisplay the odd numbers: ");
        i=max;
        do{
            r=i%2;
            if(r==1)
                System.out.println(i);
            i++;
        }while(i<=max);
    }
}