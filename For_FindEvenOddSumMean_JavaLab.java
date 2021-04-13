import java.util.Scanner;

public class For_FindEvenOddSumMean_JavaLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum integer: ");
        int max = sc.nextInt();
        int num = 0, evensum = 0, oddsum = 0, evencount = 0, oddcount = 0;

        System.out.print("\nEven numbers are :");
        for(int i=0; i<=max; i++){
            num=i%2;
            if(num==0){
                System.out.println(i);
                evensum += i;
                evencount++;

        }}
        System.out.print("\nOdd numbers are :");

        for(int i=0; i<=max; i++){
            num=i%2;
            if(num==1){
                System.out.println(i);
                oddsum+=i;
                oddcount++;
        }}

        System.out.println("\nThere are " + evencount + " even numbers");
        System.out.println("There are " + oddcount + " odd numbers");

        System.out.println("\nThe sum of Even number is "+evensum);
        System.out.println("The sum of Odd numbers is " +oddsum);

        System.out.println("\nMean of Even numbers= " + (evensum/evencount));
        System.out.println("Mean of Odd numbers= " + (oddsum/oddcount));

    }
}


