package org.generation.model;
import java.util.ArrayList;

public class Courses {

    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;


    //Constructor
public Courses(String courseName, String professorName, int year){
    this.courseName = courseName;
    this.professorName = professorName;
    this.year = year;
    this.students = new ArrayList<>();
}//constructor Courses


    //Methods
    public void enroll(Student student){
        this.students.add(student);
    }// method enroll add the student to the collection ArrayList

    public void enroll(Student[] students){
        for(Student student: students){
            this.enroll(student);
        }//for each
    }// method enroll add a masive array of students to the collection ArrayList


    public void unEnroll(Student student){

        Student tempStudent = student;

        for (Student std: students) {
            if (tempStudent.equals(std)) {
                tempStudent = std;
                break;
            }// if
        }//for each

        this.students.remove(tempStudent);
    }// method unenroll: remove this student from the collection

    public int countStudents(){

        return this.students.size();
    }// method countStudents


    public int bestGrade(){
        int max = 0;

        for(Student student: this.students){
            if (student.grade > max){
                max = student.grade;
            }//if
        }// for each
        return max;
    }


    double average (Courses) {
        
    }


    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", professorName='" + professorName + '\'' +
                ", year=" + year +
                ", students=" + students +
                '}';
    }
}//class courses
