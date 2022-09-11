

package H202;

//H202
//Reverse character
import java.util.Scanner;



public class H202 {
    public static String printReverse(String input){
        char split[]=input.toCharArray(); //String to array
        String reverse=""; //Initial emptty string

        for (int i = split.length-1; i>=0; i--) { //Using for loop from tail to head
            reverse+=split[i];
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = sc.nextLine();
        while(input.isEmpty()==true){//Check input until not empty
            System.err.println("Your String input is empty! Enter input:");
            input = sc.nextLine();
        }
        sc.close();
        System.out.println(printReverse(input));//Print result
    }
}
 