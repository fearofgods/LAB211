/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0011;
/**
 *
 * @author hongd
 */
public class Function {
    //Convert binary to decimal
    static long binToDec(String bin){
        String temp = bin;
        long dec = 0,base =1;
        // Init base =1
        // Loop if char at i = 1 dec = dec + base and base = base * 2;
        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i)=='1') {
                dec += base;
            }
            base *= 2;
        }
        return dec;
    }
    //Convert decimal to hexa
    void decToHex(String dec){
        //Convert string to long integer
        long dectemp = Long.parseLong(dec);
        //Char array to store hexa number
        char[] hex = new char[100];
        //Init i to count element in array
        int i=0;
        while (dectemp != 0) {            
            //temp to store remainder
            long temp = 0;
            temp = dectemp % 16;
            //mod input with 16 if result < 10 then result + 48  
            if (temp < 10) {
                hex[i] = (char)(temp + 48);
                i++;
            // If result > 10 the result + 55
            }else {
                hex[i] = (char)(temp + 55);
                i++;
            }
            //Divide with 16 and continue mod with 16 to the end
            dectemp /=16;
        }
        System.out.print("Result: ");
        //Print array in reverse order
        for (int j = i-1; j >= 0; j--) {
            System.out.print(hex[j]);
        }
        System.out.println("\n");
    }
    //Convert hexa to dec
    long hexToDec(String hex){
        String temp = hex.toUpperCase();
        long base = 1, dec =0;
        for (int i = temp.length()-1; i >= 0; i--) {
            //If char at i in range 0 to 9, subtracting 48 from ASCII
            if (temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
                dec += (temp.charAt(i) - 48) * base;
                //Increase base by power
                base *= 16;
            //If char at i in range A to F, subtracting 55 from ASCII
            } else if (temp.charAt(i) >= 'A' && temp.charAt(i) <= 'F'){
                dec += (temp.charAt(i) - 55) * base;
                //Increase base by power
                base *= 16;
            }
        }
        return dec;
    }
    //Convert dec to bin
    void decToBin(String dec){
        //Convert String to long integer
        long temp = Long.parseLong(dec);
        long[] bin = new long[100];
        int i = 0;
        //Loop temp mod 2 until end
        while (temp > 0){            
            bin[i] = temp%2;
            temp/=2;
            i++;
        }
        //Print array in reverse order
        System.out.print("Result: ");
        for (int j = i-1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
        System.out.println("\n");
    }
}
