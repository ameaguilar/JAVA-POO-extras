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


    public double average () {
        int total = 0;
        for(Student student : students){
            total = total + student.grade ++;
        }// for each to sum the grade
        return (double) total / this.students.size();
    }//method for calculate the average of a course

    public void ranking() {

        students.sort((student1, student2) -> student2.grade - student1.grade); //sort order the averga but we must indicate the program how
        for (Student student : students) {
            System.out.println(student.firstName + " → " + student.grade);
        }// for
    }// Method to rank students by grade in a course

    public void isAboveAverage() {
        double average = this.average();

        for (Student student : this.students) {
            if (student.grade > average) {
                System.out.println(student.firstName + " → está por encima del promedio");
            } else {
                System.out.println(student.firstName + " → no está por encima del promedio");
            }
        }
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
