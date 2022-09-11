
package P0011;

import java.util.Scanner;

/**
 *
 * @author hongd
 */
public class Validate {
    private final static Scanner sc = new Scanner(System.in);
    
    public static int checkInputLimit(int min, int max){
        while (true) {            
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max){ //Check input in range min to max
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) { // If input not in min and max throw exception and require re-input
                System.out.println("Please input from "+min+" to "+max+":");
                
            }
        }
    }
    //Check input binary
    public static String checkBinary(){
        System.out.println("Enter number binary: ");
        String result;
        while(true){
            result = sc.nextLine().trim();//Enter input
            if(result.matches("[0-1]*")){//Binary condition 0-1
                return result;
            }
            System.out.println("Must be enter 0-1: ");
        }
    }
    //Check input decimal
    public static String checkDecimal(){
        System.out.println("Enter number decimal: ");
        String result;
        while (true) {            
            result = sc.nextLine().trim();//Enter input
            if(result.matches("[0-9]*")){//Decimal condition 0-9
                return result;
            }
            System.out.println("Must be enter 0-9: ");
        }
    }
    //Check input hex
    public static String checkHex(){
        System.out.println("Enter number hex: ");
        String result;
        while(true){
            result = sc.nextLine().trim().toUpperCase();//Enter input
            if(result.matches("[0-9A-F]*")){//Hex condition 0-9 A-F
                return result;
            }
            System.out.println("Must be enter 0-9 or A-F");
        }
    }
    
    
}
