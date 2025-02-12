public class JaggedArray {
    public static void main(String[] args) {

        int [][]jagged_array = {

                {1, 2, 3, 4},
                {50, 6, 7, 81, 9, 10},
                {110, 120},
                {101, 102, 109, 158, 179, 200, 25, 58}
        };

        System.out.println("Jagged array: \n");
        for (int i = 0; i < jagged_array.length; i++) {
            for (int j = 0; j < jagged_array[i].length; j++)
                System.out.print(jagged_array[i][j] + "\t");
            System.out.println();
        }

    }
}
