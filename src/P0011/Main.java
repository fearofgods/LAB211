/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0011;

import java.util.Scanner;
/**
 *
 * @author hongd
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function fc = new Function();
        do {            
            System.out.println("Choose input:");
            System.out.print("1. Binary 2. Decimal 3. Hexadecimal :  ");
            int input = Validate.checkInputLimit(1, 3);
            System.out.println("Choose output:");
            System.out.print("1. Binary 2. Decimal 3. Hexadecimal :  ");
            int output = Validate.checkInputLimit(1, 3);
            String in;
            switch(input){
                //Convert from bin
                case 1:
                    in = Validate.checkBinary();
                    switch (output) {
                        case 1://To bin
                            System.out.println("Input still is binary!");
                            break;
                        case 2://To dec
                            System.out.println(fc.binToDec(in));
                            break;
                        case 3://To hex
                            String hex = String.valueOf(fc.binToDec(in));
                            fc.decToHex(hex);
                            break;
                    }
                    
                    break;
                //Convert from dec
                case 2:
                    in = Validate.checkDecimal();
                    switch (output) {
                        case 1://To bin
                            System.out.print("Result: ");
                            fc.decToBin(in);
                            break;
                        case 2://To dec
                            System.out.println("Input still is decimal!");
                            break;
                        case 3://To hex
                            fc.decToHex(in);
                            break;
                    }
                    break;
                //Convert from hex
                case 3:
                    in = Validate.checkHex();
                    switch (output) {
                        case 1://To bin
                            String dec = String.valueOf(fc.hexToDec(in));
                            fc.decToBin(dec);
                            break;
                        case 2://To dec
                            System.out.print("Result: ");
                            fc.hexToDec(in);
                            break;
                        case 3://To hex
                            System.out.println("Input still is hexadecimal!");
                            break;
                    }
                    break;
            }
        } while (true);
    }
}
