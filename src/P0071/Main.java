/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0071;

import java.util.ArrayList;

/**
 *
 * @author hongd
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<>();
        list.add(new Task(1, "Dev program", 1, "10-24-2021", 9.0, 10.0, "Dev 1", "Leader"));
        list.add(new Task(2, "Test program", 2, "10-25-2021", 8.5, 11.5, "Tester 1", "Tester"));
        list.add(new Task(3, "Dev program", 3, "10-25-2021", 9.5, 11.0, "Dev 2", "Leader"));
        list.add(new Task(4, "Dev program", 1, "10-25-2021", 8.5, 12.0, "PDuong", "Tester"));
        list.add(new Task(5, "Test program", 2, "10-25-2021", 8.5, 11.5, "Tester 2", "Tester"));
        Validate va = new Validate();
        Function f = new Function();
        while (true) {
            System.out.println("========= Task Manager =========");
            System.out.println("1. Add task");
            System.out.println("2. Update task");
            System.out.println("3. Delete task");
            System.out.println("4. Display task");
            System.out.println("5. Exit");
            int choice = va.getInputInt(1, 5);
            switch(choice){
                case 1:
                    f.addTask(list);
                    break;
                
                case 2:
                    int id = va.enterID();
                    f.updateTask(list, id);
                    break;
                    
                case 3:
                    int deleteId = va.enterID();
                    f.deleteTask(list, deleteId);
                    break;
                    
                case 4:
                    f.printTask(list);
                    break;
                    
                case 5:
                    break;
            }
        }
    }
}
