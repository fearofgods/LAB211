
package P0001;

//P0001
//Bubblesort

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hongd
 */
public class P0001 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    //Check input only positve integer
    public static int validateInput(){
        int check=-1;
        do {
            try {
                check= Integer.parseUnsignedInt(sc.nextLine());//Only accept positive integer
                if(check>0){
                    return check;
                }
            } catch (NumberFormatException e) {//Catch if input is not positive integer 
                System.out.println("Please enter positive integer: ");
            }
        } while (check<1);
        return 0;
    }
    //Input array size
    public static int inputSizeArray(){
        System.out.println("Enter size of array: ");
        int size = validateInput();
        return size;
    }
    //Random array
    public static int[] randomNumber(int size){
        int[] a= new int[size];
        for(int i=0; i<size; i++){//Use loop to random int number in size range
            a[i] = rd.nextInt(size);//a[i] to store random int
        }
        return a;
    }
    //Sorting bubble sort
    public static void sortingBubbleSort(int a[]){
        int size=a.length;
        //Loop to access array element
        for (int i = 0; i < size-1; i++) {
            // Loop to compare array elements
            for(int j=0;j<size-i-1;j++){
                // Compare element
                if(a[j]>a[j+1]){
                    //Swaping if condition is true
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    //Print array
    public static void printArray(int a[]){
        int n = a.length;
        for (int i=0; i<n; ++i)//Use loop to print array
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int size=inputSizeArray();
        System.out.println("Original array: ");
        int array [] = P0001.randomNumber(size);
        printArray(array);
        sortingBubbleSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
        
    }
}
