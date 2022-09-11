/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0021;

import java.util.Scanner;

/**
 *
 * @author hongd
 */
public class Validate {

    private final static Scanner sc = new Scanner(System.in);
    //Check input string, not empty
    public String checkStringInput() {
        String result = sc.nextLine().trim();
        while (result.isEmpty()) {
            System.out.print("Please enter something: ");
            result = sc.nextLine().trim();
        }
        return result;
    }
    //Check input int
    public int checkIntInput() {
        
        int result;
        while (true) {
            try {
                result = Integer.parseInt(checkStringInput());
                if (result <= 0) {
                    System.out.println("Please enter positive integer number!");
                    System.out.print("Enter again: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter positive integer number!");
                System.out.print("Enter again: ");
            }
        }
        return result;
    }
    //Check limit int
    public int checkLimit(int min, int max) {
        int option;
        while (true) {
            option = checkIntInput();
            //Check input in range max and min
            if (option < min || option > max) {
                System.out.print("Please enter in range " + min + " to " + max + ": ");
            } else {
                break;
            }
        }
        return option;
    }
    //Check course name java,.net,c/c++
    public String inputCourseName() {
        System.out.print("Enter course name: ");
        while (true) {
            String coursename = checkStringInput();
            if (coursename.equalsIgnoreCase("java") || coursename.equalsIgnoreCase(".net") || coursename.equalsIgnoreCase("c/c++")) {//Check condition
                //If true return course name
                return coursename;

            }
            System.out.println("Course name must be Java, .Net or C/C++ !");
                System.out.print("Enter again: ");
        }
    }
    //Check Yes/No
    //User only can input Y or N
    public boolean checkYN() {
        while (true) {            
            String result = checkStringInput();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.print("Please input Y/N: ");
        }
    }
    //Check Update/Delete
    //User only can input U or D
    public boolean checkUD(){
        while (true) {            
            String result = checkStringInput();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.out.print("Please input U/D: ");
        }
    }
    //Input id
    public String inputID() {
        System.out.print("Enter id: ");
        String choice = checkStringInput();//Check string
        return choice;
    }
    //Input semester
    public int inputSemester() {
        System.out.print("Enter semester: ");
        int choice = checkIntInput();//Check int
        return choice;
    }
    //Input student name
    public String inputStudentname() {
        System.out.print("Enter name: ");
        String choice = checkStringInput();//Check string
        return choice;
    }

}
