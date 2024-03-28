package Questions;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        int columns=s.nextInt();

        int[][] matrix = new int[rows][columns];

        //Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                 matrix[i][j]=s.nextInt();
            }
        }

        //Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Number Search
        int x = s.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j]==x)
                    System.out.println("x is found at " + "(" +i + "," +j +")");
            }
        }
    }
}