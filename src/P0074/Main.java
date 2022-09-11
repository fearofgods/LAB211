/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0074;

/**
 *
 * @author hongd
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Plus Matrix");
            System.out.println("2. Sub Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = Function.checkLimit(1, 4);
            switch (choice) {
                case 1:
                    Function.plusMatrix();
                    break;
                case 2:
                    Function.subMatrix();
                    break;
                case 3:
                    Function.multiplicationMatix();
                    break;
                case 4:
                    break;
            }
        }
    }

}
