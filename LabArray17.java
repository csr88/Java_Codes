import java.util.Scanner;
public class LabArray17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();
        System.out.println("Enter the " +  count + " integers: ");

        int[] arr = new int[count];
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the specified number: ");
        int num = sc.nextInt();

        int sum=0;
        for (int i=0;i<count;i++){
            for (int j=i+1;j<count;j++){
                sum = arr[i] + arr[j];
                    if (sum == num){
                        System.out.println("\nTarget Value: "+arr[i]+"+"+arr[j]+"= " + num);
                    }
                }
            }
        }

    }


