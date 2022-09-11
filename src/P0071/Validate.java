/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0071;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hongd
 */
public class Validate {

    Scanner sc = new Scanner(System.in);//Init Sacnner

    public int getInputInt(int from, int to) {//Get input int
        int input = 0;
        while (true) {
            try {
                System.out.print("Input choice from [" + from + "] to [" + to + "]: ");
                input = Integer.parseInt(sc.nextLine());//receive input value
                if (input >= from && input <= to) {//Condition input
                    break;
                }
            } catch (Exception e) {//Exception if input wrong
                System.out.print("Please! input choice from [" + from + "] to [" + to + "]: ");
            }
        }
        return input;
    }

    public int enterID() {//Input id
        int id = 0;
        while (true) {
            try {
                System.out.print("Enter id: ");
                id = Integer.parseInt(sc.nextLine());//Receive input id
                break;
            } catch (Exception e) {//Exception if input wrong
                System.out.print("Invalid id, please enter again!");
            }
        }
        return id;
    }

    public int addId(ArrayList<Task> list) {//Add id
        int lastElemet = list.size() - 1;//init lastindex = size - 1
        int lastId = list.get(lastElemet).getId();//Get last id
        int newId = lastId + 1;//New id
        return newId;
    }

    public String enterName() {//Input name
        System.out.print("Enter name: ");
        String name = sc.nextLine();//receive name
        return name;
    }

    public int checkTypeId() {//Check id type
        int id = 0;
        while (true) {
            try {
                System.out.println("1.Code 2.Test 3.Design 4.Review");
                System.out.print("Enter type id: ");
                id = Integer.parseInt(sc.nextLine());//Enter id ty
                if (id >= 1 && id <= 4) {//Check condition id type 1-4
                    break;
                }
            } catch (Exception e) {//Exception if input wrong
                System.out.print("Invalid type id, please enter agian!");
            }
        }
        return id;
    }

    public String checkDate() {//Check date
        SimpleDateFormat sd = new SimpleDateFormat("MM-dd-yyyy");//Date format day-month-year
        sd.setLenient(false);
        Date date;
        while (true) {
            try {
                System.out.print("Enter date: ");
                date = sd.parse(sc.nextLine());
                break;
            } catch (Exception e) {//Exception if input wrong
                System.out.print("Invalid date, please enter again!");
            }
        }
        return sd.format(date);
    }
    
    //Conditon from and to %0.5 ==0 and in range 8 - 17.5
    public double checkFrom() {
        double from = 0;
        while (true) {
            try {
                System.out.print("From: ");
                from = Double.parseDouble(sc.nextLine());
                if (from >= 8 && from <= 17.5) {//From condition
                    if (from % 0.5 == 0) {
                        break;
                    }
                }
            } catch (Exception e) {//Exception if input wrong
                System.out.println("Wrong input, please enter again!");
            }
        }
        return from;
    }

    public double checkTo(double from) {
        double to = 0;
        while (true) {
            try {
                System.out.print("To: ");
                to = Double.parseDouble(sc.nextLine());
                if (to >= 8 && to <= 17.5) {//To condition
                    if (to % 0.5 == 0 && to > from) {//%0.5 == 0 and to > from
                        break;
                    }
                }
            } catch (Exception e) {//Exception if input wrong
                System.out.println("Wrong input, please enter again!");
            }
        }
        return to;
    }
    
    public String enterAssign() {//Assign
        System.out.print("Enter assign: ");
        String assign = sc.nextLine();//Enter assign
        return assign;
    }

    public String enterReviewer() {//Reviewer
        System.out.print("Enter reviewer: ");
        String review = sc.nextLine();//Enter reviewer
        return review;
    }

    public boolean checkNope() {//Check nope or ch
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("nope")) {//nope to cancel
                return false;
            } else if (input.equalsIgnoreCase("ch")) {//ch to change
                return true;
            } else {
                System.out.print("Please choose ch(change) or `nope` to cancel!\n");

            }
        }
    }

}
