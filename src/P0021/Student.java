/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0021;
/**
 *
 * @author hongd
 */
public class Student implements Comparable<Student>{
    String id;
    String student;
    int semester;
    String coursename;

    public Student() {
    }

    public Student(String id, String student, int semester, String coursename) {
        this.id = id;
        this.student = student;
        this.semester = semester;
        this.coursename = coursename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

 
    public void print() {
        System.out.printf("%-25s%-20s%-15s\n", student, semester, coursename);
    }

    @Override
    public int compareTo(Student x){
        return x.student.compareTo(this.student);
    }
    
    
}
