package workshop1;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        int[][] matrix;
        int row = 0, column = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter number row of matrix: ");
                row = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number column of matrix: ");
                column = Integer.parseInt(scanner.nextLine());
            }catch (Exception exception){
                System.out.println("Invalid!");
            }
            if(column > 0 && row > 0){
                break;
            }else {
                System.out.println("Value of row and column must be > 0");
            }
        }
        matrix = new int[row][column];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                while (true){
                    try {
                        System.out.print("Enter entry [" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    }catch(Exception exception){
                        System.out.println("Invalid value enter again!");
                    }
                }
            }
        }
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + "\t");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum matrix: " + sum);
        System.out.println("Average value of this matrix: " + (float)(sum)/(row * column));

    }
}
