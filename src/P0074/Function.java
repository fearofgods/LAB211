/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0074;

import java.util.Scanner;

/*
 *
 * @author hongd
 *
 */
public class Function {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());//Enter input 
                if (result < min || result > max) { //Check input in range min to max
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) { // If input not in min and max throw exception
                System.out.println("Please input from " + min + " to " + max + ":");

            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());//Enter int input, if true return result
                return result;
            } catch (NumberFormatException ex) {
                System.out.println("Please input integer number: ");//False require re-enter
            }
        }
    }

    //Input matrix
    public static int[][] inputMatrix(int row, int column, int x) {//x is number of matrix

        int matrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Matrix " + x + "[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = checkInputInt();
            }
        }
        return matrix;
    }

    //Display matrix
    public static void printMatrix(int matrix[][]) {
        int row = matrix.length;// length of row
        int column = matrix[0].length;//length of column
        for (int i = 0; i < row; i++) {//access to row
            for (int j = 0; j < column; j++) {//access to column
                System.out.printf("[%d]", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    //Plus matrix
    public static void plusMatrix() {
        System.out.println("----------Plus Matrix---------");
        System.out.print("Enter row of matrix 1: ");
        int row1 = checkInputInt();//Enter row matrix 1
        System.out.print("Enter column of matrix 1: ");
        int column1 = checkInputInt();//Enter column matrix 1
        System.out.print("Enter row of matrix 2: ");
        int row2 = checkInputInt();//Enter row matrix 2
        System.out.print("Enter column of matrix 2: ");
        int column2 = checkInputInt();//Enter column matrix 2
        System.out.println("------------------------------");
        //Condition of subtraction matrix row of first matrix = row of second matrix
        while (row1 != row2) {//Check condition 
            System.out.println("Wrong condition! Row 1 must be equal to row 2.");
            System.out.print("Enter row of matrix 2: ");
            row2 = checkInputInt();
        }
        //Condition of subtraction matrix column of first matrix = column of second matrix
        while (column1 != column2) {
            System.out.println("Wrong condition! Column 1 must be equal to column 2.");
            System.out.print("Enter column of matrix 2: ");
            column2 = checkInputInt();
        }
        System.out.println("--------Enter matrix 1--------");//Enter matrix 1
        int matrix1[][] = inputMatrix(row1, column1, 1);
        
        System.out.println("--------Enter matrix 2--------");//Enter matrix 2
        int matrix2[][] = inputMatrix(row2, column2, 2);
        int result[][] = new int[row1][column1];//Init result array
        for (int i = 0; i < row1; i++) {//Use loop to access row
            for (int j = 0; j < column1; j++) {//Use loop to access column
                result[i][j] = matrix1[i][j] + matrix2[i][j];//Calculate matrix 1 + matrix 2 and store result in result array
            }
        }
        System.out.println("------------Result------------");
        System.out.println("------------------------------");
        printMatrix(matrix1);
        System.out.println("+");
        printMatrix(matrix2);
        System.out.println("=");
        printMatrix(result);
    }

    //Sub matrix
    public static void subMatrix() {
        System.out.println("----------Sub Matrix---------");
        System.out.print("Enter row of matrix 1: ");
        int row1 = checkInputInt();//Enter row matrix 1
        System.out.print("Enter column of matrix 1: ");
        int column1 = checkInputInt();//Enter column matrix 1
        System.out.print("Enter row of matrix 2: ");
        int row2 = checkInputInt();//Enter row matrix 2
        System.out.print("Enter column of matrix 2: ");
        int column2 = checkInputInt();//Enter column matrix 2
        System.out.println("------------------------------");
        //Condition of subtraction matrix row of first matrix = row of second matrix
        while (row1 != row2) {//Check condition 
            System.out.println("Wrong condition! Row 1 must be equal to row 2.");
            System.out.print("Enter row of matrix 2: ");
            row2 = checkInputInt();
        }
        //Condition of subtraction matrix column of first matrix = column of second matrix
        while (column1 != column2) {
            System.out.println("Wrong condition! Column 1 must be equal to column 2.");
            System.out.print("Enter column of matrix 2: ");
            column2 = checkInputInt();
        }
        System.out.println("--------Enter matrix 1--------");//Enter matrix 1
        int matrix1[][] = inputMatrix(row1, column1, 1);
        
        System.out.println("--------Enter matrix 2--------");//Enter matrix 2
        int matrix2[][] = inputMatrix(row2, column2, 2);
        int result[][] = new int[row1][column1];//Init result array
        for (int i = 0; i < row1; i++) {//Use loop to access row
            for (int j = 0; j < column1; j++) {//Use loop to access column
                result[i][j] = matrix1[i][j] - matrix2[i][j];//Calculate matrix 1 - matrix 2 and store result in result array
            }
        }
        System.out.println("------------Result------------");
        System.out.println("------------------------------");
        printMatrix(matrix1);
        System.out.println("-");
        printMatrix(matrix2);
        System.out.println("=");
        printMatrix(result);
    }

    //Multiplication
    public static void multiplicationMatix() {
        System.out.println("----------Multi matrix---------");
        System.out.print("Enter row of matrix 1: ");
        int row1 = checkInputInt();//Enter row matrix 1
        System.out.print("Enter column of matrix 1: ");
        int column1 = checkInputInt();//Enter column matrix 1
        System.out.print("Enter row of matrix 2: ");
        int row2 = checkInputInt();//Enter row matrix 2
        System.out.print("Enter column of matrix 2: ");
        int column2 = checkInputInt();//Enter column matrix 2
        System.out.println("------------------------------");
        //Check conditon row of first matrix = column of second matrix
        while (column1 != row2) {//Check conditon 
            System.out.println("Wrong condition! Re-enter column of matrix 2.");
            System.out.print("Enter column of matrix 2: ");
            column2 = checkInputInt();//If wrong re-enter
        }
        
        System.out.println("--------Enter matrix 1--------");//Enter matrix 1
        int matrix1[][] = inputMatrix(row1, column1, 1);
        System.out.println("--------Enter matrix 2--------");//Enter matrix 2
        int result[][] = new int[row1][column2];
        int matrix2[][] = inputMatrix(row2, column2, 2);
        
        for (int i = 0; i < row1; i++) {//access to row 1
            for (int j = 0; j < column2; j++) {//access to column 2
                for (int k = 0; k < column1; k++) {//access to column 1
                    result[i][j] += matrix1[i][k] * matrix2[k][j];//Multi 2 matrix and plus to result
                    //result = result + matrix1 * matrix2
                }
            }
        }
        System.out.println("------------Result------------");
        System.out.println("------------------------------");
        printMatrix(matrix1);
        System.out.println("*");
        printMatrix(matrix2);
        System.out.println("=");
        printMatrix(result);

    }
}
