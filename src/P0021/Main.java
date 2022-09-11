/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0021;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongd
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function fn = new Function();
        Validate va = new Validate();
        int count = 4;
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student("1", "Nguyen Van A", 2, "Java"));
        st.add(new Student("1", "Nguyen Van A", 3, "Java"));
        st.add(new Student("1", "Nguyen Van A", 2, "C/C++"));
        st.add(new Student("1", "Nguyen Van A", 2, ".Net"));
        st.add(new Student("2", "Nguyen Van B", 3, "C/C++"));
        st.add(new Student("3", "Nguyen Van C", 3, "Java"));
//        st.add(new Student("4", "Nguyen Van D", 3, "Java"));
        while (true) {
            fn.menu();
            int choice = va.checkLimit(1, 5);
            switch (choice) {
                case 1:
                    fn.createStudent(st);
                    System.out.println("------------------------------");
                    break;
                case 2:
                    fn.findSort(st);
                    System.out.println("------------------------------");
                    break;
                case 3:
                    fn.updateDelete(st);
                    System.out.println("------------------------------");
                    break;
                case 4:
                    fn.displayReport(st);
                    System.out.println("------------------------------");
                    break;
                case 5:
                    break;

            }
        }
    }
}
