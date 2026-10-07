package org.generation.model;



public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;


    //Student SUPERconstructor 1:
    public Student (String firstName, String lastName, int registration, int grade, int year) {
    this.firstName = firstName.toUpperCase();
    this.lastName = lastName.toUpperCase();
    this.registration = registration;
    this.grade = grade;
    this.year = year;
    }// student constructor


    public Student(String firstName, String lastName, int registration, int grade){
        this(firstName, lastName, registration, grade, 1);
    }//constructor 2 student

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 2026, 0,1);
    }//constructor 3 student




    //Methods:

    public void printFullName(){

        System.out.print(firstName + " " + lastName);
    }

    public boolean isApproved(){
        if (grade < 60) {
            return false;
        }
        return true;
    }//isApproved method: return true if grade >= 60

    public int changeYearIfApproved(){
        if (isApproved()){
            year = year + 1;  // equivalent year ++
            System.out.println("Congratulations");
            return year;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registration=" + registration +
                ", grade=" + grade +
                ", year=" + year +
                '}';
    }//to String
}// class student
