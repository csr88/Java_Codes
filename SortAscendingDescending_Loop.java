import java.util.Scanner;

public class SortAscendingDescending_Loop {
    public static void main(String[] args) {
        int count, temp, sum = 0;

        //input the array size
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        count = sc.nextInt();

        //create the array
        int arr[] = new int[count];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        //sorting the numbers in ascending order

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] > arr[j]) { //to make descending arr[i] < arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println("Array elements in ascending order are: ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(arr[i] + ",");
        }

        /*we can use i<=count-1 to print all but in order to now show comma after last number
         *we print the last element without comma after the loop is finished at the second last element
         */
        System.out.println(arr[count - 1]);


        for(int i=0; i<count-1; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of the elements of the array : "+sum);


        }
    }
