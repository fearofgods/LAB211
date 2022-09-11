/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0021;

import java.util.ArrayList;
import java.util.Collections;
import javafx.print.Collation;

/**
 *
 * @author hongd
 */
public class Function {

    Validate va = new Validate();
    ArrayList<Student> stlist = new ArrayList<>();

    //Function display menu
    public void menu() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("1. Create");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.println("(Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program).");
        System.out.print(">Your choice: ");
    }

    //Check student exist or not
    public boolean checkStudentExist(ArrayList<Student> st, String id, String student, int semester, String coursename) {
        for (Student stu : st) {//Use loop for each
            //Check same name,same id, same semester, same coursename
            if (id.equalsIgnoreCase(stu.getId()) && student.equalsIgnoreCase(stu.getStudent())
                    && semester == stu.getSemester() && coursename.equalsIgnoreCase(stu.getCoursename())) {
                return false;//Return false if wrong conditon
            }
        }
        return true;//Else return true
    }

    //Check id exist or not
    public boolean checkIdExist(ArrayList<Student> st, String id, String name) {
        //Use loop for each
        for (Student stu : st) {
            //Check same id, same name
            if (id.equalsIgnoreCase(stu.getId()) && !name.equalsIgnoreCase(stu.getStudent())) {
                return false;//Return false`
            }
        }
        return true;

    }

    //Create student
    public void createStudent(ArrayList<Student> st) {
        //Init count
        int count = st.size();
        //Check if has more than 5 record ask user to continue or not
        if (count >= 5) {
            System.out.println("You have " + count + " record!");
            System.out.print("Do you want to add more? (Y/N): ");
            //Ask yes or no
            if (!va.checkYN()) {
                return;
            }
        }

        while (true) {
            String id = va.inputID();//Enter id
            String name = va.inputStudentname();//Enter name
            //Check id exist
            if (!checkIdExist(st, id, name)) {
                System.out.println("Id has been exist. Please choose other Id!");
                continue;
            }
            int semester = va.inputSemester();//Enter semester
            String course = va.inputCourseName();//Enter coursename
            if (checkStudentExist(st, id, name, semester, course)) {//Check student if exist or not
                st.add(new Student(id, name, semester, course));//If not exist add student to list
                System.out.println("Add successfully!");
                return;
            }
            System.out.println("The record has been duplicated!");

        }

    }
    //Find and sort
    public void findSort(ArrayList<Student> st) {
        if (st.isEmpty()) {//Check list empty or not
            System.out.println("List empty!");
            return;
        }
        ArrayList<Student> findlist = findlist(st);
        if (findlist.isEmpty()) {//Check if findlist empty or not
            System.out.println("Name not exist!");
        } else {
            Collections.sort(findlist);//Sort list
            Collections.reverse(findlist);
            System.out.printf("%-25s%-20s%-15s\n", "Student name", "Semester", "Course name");
            for (Student student : findlist) {//Use loop to print student in list
                student.print();
            }
        }
    }
    //Find student by name
    public ArrayList<Student> findlist(ArrayList<Student> st) {//Find student
        ArrayList<Student> findlist = new ArrayList<>();//Init new list
        String name = va.inputStudentname();//Enter name to search
        for (Student student : st) {//Use loop to find
            if (student.getStudent().toLowerCase().contains(name.toLowerCase())) {//If input matches with elements in list
                findlist.add(student);//Add to list
            }
        }
        return findlist;//Return find list
    }
    //Find student by id
    public ArrayList<Student> getStudentbyId(ArrayList<Student> st, String id) {//Get student by id
        ArrayList<Student> getStudentbyId = new ArrayList<>();//Init new list
        for (Student student : st) {//Use loop
            if (id.equalsIgnoreCase(student.getId())) {//if id matches with id inlist
                getStudentbyId.add(student);//Add student to list
            }
        }
        return getStudentbyId;//Return list
    }
    //Print student founded
    public Student studentFoundList(ArrayList<Student> stfound) {//Print student founded
        int count = 1;
        System.out.printf("%-10s%-25s%-15s%-15s\n", "Number", "Student name", "Semester", "Course name");
        for (Student student : stfound) {
            System.out.printf("%-10d%-25s%-15d%-15s\n", count, student.getStudent(), student.getSemester(), student.getCoursename());//Print list
            count++;//And add count
        }
        System.out.print("Choose id you want to Delete or Update: ");
        int choice = va.checkLimit(1, stfound.size());//Choice 1 - size of list
        return stfound.get(choice - 1);//Return object at index
    }
    //Update and delete
    public void updateDelete(ArrayList<Student> st) {//Delete or update
        if (st.isEmpty()) {//Check list empty or not
            System.out.println("List empty!");
            return;
        }

        String id = va.inputID();//Enter id
        ArrayList<Student> list = getStudentbyId(st, id);
        if (list.isEmpty()) {//Check empty or not
            System.out.println("Not found!");
            return;
        } else {
            Student stu = studentFoundList(list);
            System.out.print("Do you want delete(D) or update(U): ");
            if (va.checkUD()) {//Check update or delete
                String idst = va.inputID();//Enter id
                String name = va.inputStudentname();//Enter name
                int semester = va.inputSemester();//Enter semester
                String coursename = va.inputCourseName();//Enter coursename
                if (checkStudentExist(st, id, idst, semester, coursename)) {//Check student exist or not
                    //if exist update
                    stu.setId(idst);//update id
                    stu.setStudent(name);//update name
                    stu.setSemester(semester);//update semester
                    stu.setCoursename(coursename);//update course name
                    System.out.println("Update successfully!");
                }
                return;
            } else {
                //delete
                st.remove(stu);//Delete object
                System.out.println("Delete successfully!");
                return;
            }
        }
    }
    //Check Report
    public void report(ArrayList<Student> st,String id) {//Input list and id
        String name ="";
        //Init count of java, c/c++, .net
        int jcount=0;
        int netcount=0;
        int ccount=0;
        //Loop from begin to end list
        for (int i = 0; i < st.size(); i++) {
            //Check if id in list and input id matches
            if (st.get(i).getId().equalsIgnoreCase(id)) {
                //Get name in list
                name = st.get(i).getStudent();
                //Check if course name equals java, c/c++ or .net then increase count
                if (st.get(i).getCoursename().equalsIgnoreCase("java")) {
                    jcount++;
                }
                if (st.get(i).getCoursename().equalsIgnoreCase("c/c++")) {
                    ccount++;
                }
                if (st.get(i).getCoursename().equalsIgnoreCase(".net")) {
                    netcount++;
                }
                
            }
        }
        //Print 
        if(jcount!=0){
            System.out.printf("%-25s|%-10s|%-5d\n",name,"Java",jcount);
        }
        if(ccount!=0){
            System.out.printf("%-25s|%-10s|%-5d\n",name,"C/C++",ccount);
        }
        if(netcount!=0){
            System.out.printf("%-25s|%-10s|%-5d\n",name,".Net",netcount);
        }
    }
    //Print report
    public void displayReport(ArrayList<Student> st){
        //Check list empty or not
        if (!st.isEmpty()) {
            //Init new array list 
           ArrayList<String> id = new ArrayList<>();
           //loop from begin to end
            for (int i = 0; i < st.size(); i++) {
                //if id not in list
                if (!id.contains(st.get(i).getId())) {
                    //add id to list
                    id.add(st.get(i).getId());
                }
            }
            //loop begin to end list id
            for (int i = 0; i < id.size(); i++) {
                //Store id in temp
                String temp = id.get(i);
                //Print report
                report(st, temp);
            }
        }else{
            System.out.println("List empty!");
        }
    }
}
