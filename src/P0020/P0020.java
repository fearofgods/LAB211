/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0020;
//P0020
//Selection sort
import P0001.P0001;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hongd
 */
public class P0020 {
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
    //Insertion sort
    public static void sortingInsertion(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            //Compare key with other element to the left until have other smaller element
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];//If condition is true swap
                j = j - 1;
            }
            //Change key at after element smaller than it
            arr[j + 1] = key;
        }
    }
    //Print array
    public static void printArray(int a[]){
        int n = a.length;
        for (int i=0; i<n; ++i)//Using loop to print elements in array
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int size=inputSizeArray();
        System.out.println("Original array: ");
        int array [] = P0001.randomNumber(size);
        printArray(array);
        sortingInsertion(array);
        System.out.println("Sorted array: ");
        printArray(array);
        
    }
}
