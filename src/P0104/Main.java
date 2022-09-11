/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0104;

/**
 *
 * @author hongd
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    //Check String is empty or not
    public static String checkString() {
        String s = sc.nextLine().trim();
        //Check until string is not empty
        while (s.isEmpty()) {
            System.err.print("Please input some think, enter again: ");
            s = sc.nextLine().trim();
        }
        return s;
    }

    // Input directory of file
    public static String inputDirectory() {
        System.out.print("Please enter directory of file:  ");
        String directory;
        // Check until user input valid directory of file
        while (true) {
            try {
                directory = checkString();
                File f = new File(directory);
                FileReader fr = new FileReader(f);
                fr.close();
                break;
            } catch (IOException e) {
                System.err.print("File doesn't exist, enter again: ");
            }
        }
        return directory;
    }

    // Input string to search
    public static String inputStringToSearch() {
        System.out.print("Please enter string to search: ");
        String searchString = sc.nextLine().trim();
        return searchString;
    }

    // Search string or letter words contain input string
    public static ArrayList<String> searchString(String stringToSearch, String directory) {
        ArrayList<String> result = new ArrayList<>();
        try {
            File f = new File(directory);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            // Loop until end of file
            while ((line = br.readLine()) != null) {
                String[] array = line.split(" ");
                // Loop from begin to end of array
                for (int i = 0; i < array.length; i++) {
                    String string = array[i];
                    if (string.contains(stringToSearch)) {// If word contains input search
                        // Add word to list
                        result.add(string);
                    }
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.err.println("File doesn't exist!");
        }
        return result;
    }

    // Display result to screen
    public static void displayResult(ArrayList<String> result) {
        System.out.println("\nSearch results:");
        // Loop from begin to end of array
        for (int i = 0; i < result.size(); i++) {
            String get = result.get(i);
            System.out.println("     " + get);
        }
    }
    
    public static void main(String[] args) {
        String directory = inputDirectory();//Input directory D:\\Code\\FA21\\Java\\LAB211\\src\\P0104\\input.txt
        String stringToSearch = inputStringToSearch();//Input String need to search
        ArrayList<String> result = searchString(stringToSearch, directory);//Return result
        displayResult(result);//Print result
    

    }
    
}
