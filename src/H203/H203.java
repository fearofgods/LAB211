
package H203;

//H203
//Reverse word

import java.util.Scanner;

public class H203 {
    public static String printReverse(String input){
        String reverse="";
        String firsthalf;
        String secondhalf;
        String split[]=input.split("\\s");//Split input by space 
        for (int i = split.length-1; i >=0; i--) { // Use loop to reverse word
            reverse+=split[i]+" ";
        }
        firsthalf = reverse.substring(0, 1).toUpperCase();//Upper case first letter
        secondhalf = reverse.substring(1).toLowerCase();//Lower case other letter
        
        return (firsthalf+secondhalf).trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Input a string: ");
        String str=sc.nextLine();
        while(str.isEmpty()==true){// Check input until not empty
//            System.err.println("Please, input not empty string: ");
            str=sc.nextLine(); 
        }
        System.out.println(printReverse(str));//Print result
    }
}
