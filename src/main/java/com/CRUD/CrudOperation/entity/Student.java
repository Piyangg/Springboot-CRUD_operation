package com.CRUD.CrudOperation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    @Column (name = "StudentID")
    private Integer Student_ID;
    @Column (name = "LName")
    private String LastName;
    @Column (name = "FName")
    private String FirstName;
    @Column (name = "Student_School")
    private String School;

    public Student(){

    }

    public Student(Integer student_ID, String lastName, String firstName, String school) {
        Student_ID = student_ID;
        LastName = lastName;
        FirstName = firstName;
        School = school;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(Integer student_ID) {
        Student_ID = student_ID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", Student_ID=" + Student_ID +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", School='" + School + '\'' +
                '}';
    }
}
