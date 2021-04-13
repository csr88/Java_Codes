import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int originalnum, remainder, result = 0;

        originalnum = number;

        while (originalnum != 0)
        {
            remainder = originalnum % 10;
            result += Math.pow(remainder, 3);
            originalnum /= 10;
        }

        if(result == number){
            System.out.println(number + " is an Armstrong number.");
        }
        else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
