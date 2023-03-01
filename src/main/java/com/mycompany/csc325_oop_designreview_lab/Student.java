
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    // private instance variables for GPA and address
    private double gpa;
    private String address;

    // constructor that takes only two parameters: name and age
    public Student(String name, short age) {
        super(name, age); // call the constructor of the parent class
    }

    // implementation of abstract getAddress method from Human class
    @Override
    public String getAddress() {
        return address;
    }

    // implementation of abstract setAddress method from Human class
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // getter method for GPA
    public double getGpa() {
        return gpa;
    }

    // setter method for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}