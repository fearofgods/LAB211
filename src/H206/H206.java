/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H206;

//H206 

import java.util.Scanner;

//Print square
/**
 *
 * @author hongd
 */
public class H206 {

    static void printSqure(int min, int max) {
        int count = min;// Init count
        while (count <= max) {//Count < max
            for (int i = count; i <= max; i++) {//If count<=max
                System.out.print(i);
            }
            for (int j = 0; j < count - min; j++) {//If count > max
                System.out.print(min + j);
            }
            System.out.println("");
            count++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min: ");
        int min = sc.nextInt();
        System.out.print("Enter max: ");
        int max = sc.nextInt();
        System.out.println("");
        
        printSqure(min, max);
    }
}
