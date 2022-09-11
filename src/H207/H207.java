
package H207;

import java.text.Normalizer;
import java.util.Scanner;

/**
 
 * @author hongd
 */

//H207
//secondHalfLetters
public class H207 {
    
    public static int secondHalfLetters(String input){
        int count=0;//Init count 
        
        input = Normalizer.normalize(input, Normalizer.Form.NFKD); // Split string unicode to ascii
        input = input.replaceAll("[^\\p{ASCII}]", ""); // Delete special char

        for (int i = 0; i <= input.length()-1; i++) { 
            if(input.codePointAt(i)>=78&&input.codePointAt(i)<=90||input.codePointAt(i)>=110&&input.codePointAt(i)<=122){
                //Check input if in range (78-90) or (110-122)
                //78=n,90=z  110=N,122=Z
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        //Ex Pham Hong Duong = 6 "P O N U O N"
        String str=sc.nextLine();
        System.out.println("Output: "+secondHalfLetters(str));
    }
}
