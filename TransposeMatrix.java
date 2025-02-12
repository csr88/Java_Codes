import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int [][]mat = new int[rows][columns];

        System.out.println("Enter " + rows*columns + " numbers: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                mat[i][j] = sc.nextInt();

            }
        }

        //print matrix
        System.out.println("\nGiven matrix: ");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }

        //transpose matrix
        int [][]transpose = new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                transpose[j][i]=mat[i][j];
            }
        }

        //print transpose of given matrix
        System.out.println("\nTranspose: ");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
