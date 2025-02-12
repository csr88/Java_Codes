import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        m = sc.nextInt();
        n = sc.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                first[i][j] = sc.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (int i = 0 ; i < m; i++)
            for (int j = 0 ; j < n; j++)
                second[i][j] = sc.nextInt();

        //Adding Matrices
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                sum[i][j] = first[i][j] + second[i][j];  //replace '+' with '-' to subtract matrices
            }
        }

        //printing in the sum in matrix form
        System.out.println("Sum of the matrices:");

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

    }
}