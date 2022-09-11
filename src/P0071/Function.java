/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0071;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongd
 */
public class Function {

    Validate va = new Validate();

    public void printTask(ArrayList<Task> list) {//Print task
        System.out.println("Id\tName\t\tTask type\tDate\t\tFrom\tTo\tAssign\t\tReviewer");
        for (Task task : list) {//Use for each to print each object
            System.out.println(task);
        }
        System.out.println("");
    }

    public void addTask(ArrayList<Task> list) {//Add task
        System.out.println("--------- Add Task ---------");
        int id = va.addId(list);//Auto add new id
        String name = va.enterName();//Enter name
        int typeId = va.checkTypeId();//Enter Typeid
        String date = va.checkDate();//Enter Date
        double from = va.checkFrom();//Enter from
        double to = va.checkTo(from);//Enter to
        String assignee = va.enterAssign();//Enter assignee
        String reviewer = va.enterReviewer();//Enter reviewer
        Task at = new Task(id, name, typeId, date, from, to, assignee, reviewer);//init new task
        list.add(at);//Add new task to list
    }

    public void updateTask(ArrayList<Task> list, int check) {//Update task
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- Update Task ---------");
        for (int i = 0; i < list.size(); i++) {//use loop run begin to end list
            if (check == list.get(i).getId()) {//Check id of task
                //Each element ask enter "ch" to change and "nope" to cancel
                //Name
                System.out.print("(Name) Enter `ch` to change or `nope` to cancel: ");
                if (va.checkNope()) {
                    String name = va.enterName();
                    list.get(i).setRequirename(name);
                }
                //Typeid
                System.out.print("(Typeid) Enter `ch` to change or `nope` to cancel: ");
                if(va.checkNope()) {
                    int typeId = va.checkTypeId();
                    list.get(i).setTaskTypeID(typeId);
                }
                //Date
                System.out.print("(Date) Enter `ch` to change or `nope` to cancel: ");
                if (va.checkNope()) {
                    String date = va.checkDate();
                    list.get(i).setDate(date);
                }
                //From
                
                double temp=0;
                System.out.print("(From) Enter `ch` to change or `nope` to cancel: ");
                if (va.checkNope()) {
                    double from = va.checkFrom();
                    temp = from;
                    list.get(i).setFrom(from);
                }
                
                //To
                System.out.print("(To) Enter `ch` to change or `nope` to cancel: ");
                if (va.checkNope()) {
                    double to = va.checkTo(temp);
                    list.get(i).setTo(to);
                }
                //Asign
                System.out.print("(Assign) Enter `ch` to change or `nope` to cancel: ");
                if (va.checkNope()) {
                    String assign = va.enterAssign();
                    list.get(i).setAssignee(assign);
                }
                //Reviewer
                
                System.out.print("(Reviewer) Enter `ch` to change or `nope` to cancel: ");
                if (va.checkNope()) {
                    String reviewer = va.enterReviewer();
                    list.get(i).setAssignee(reviewer);
                }
            }
        }
        System.out.println("Update successfully");
    }
    //Delete task
    public void deleteTask(ArrayList<Task> list, int id) {
        System.out.println("--------- Delete Task ----------");
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {//Use loop from begin to end of list
            if (id == list.get(i).getId()) {//If input id = id in list
                list.remove(i);//Remove 
                check = false;
                System.out.println("Delete successful!");//If delete sucess
                break;
            }
        }
        if (check) {
            System.out.println("Delete failed!");//If failed
        }
    }

}
