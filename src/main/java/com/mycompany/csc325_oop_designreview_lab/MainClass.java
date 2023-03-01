/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {
    
    // ToDo 6: Fix the constructor of Student class
    static class Student {
        private String name;
        private short age;
        private double gpa;
        
        public Student(String name, short age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public short getAge() {
            return age;
        }
        
        public void setAge(short age) {
            this.age = age;
        }
        
        public double getGpa() {
            return gpa;
        }
        
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }
    
    // ToDo 7: Create two classes for Freshman and Senior 
    static class Freshman extends Student {
        private int credits;
        
        public Freshman(String name, short age, int credits) {
            super(name, age);
            this.credits = credits;
        }
        
        public int getCredits() {
            return credits;
        }
        
        public void setCredits(int credits) {
            this.credits = credits;
        }
        
        // ToDo 9: Add a toString method for Freshman class
        @Override
        public String toString() {
            return "Name: " + getName() + ", Age: " + getAge() + ", Credits: " + getCredits() + ", GPA: " + getGpa();
        }
    }
    
    static class Senior extends Student {
        private int credits;
        
        public Senior(String name, short age, int credits) {
            super(name, age);
            this.credits = credits;
        }
        
        public int getCredits() {
            return credits;
        }
        
        public void setCredits(int credits) {
            this.credits = credits;
        }
        
        // ToDo 10: Add a toString method for Senior class
        @Override
        public String toString() {
            return "Name: " + getName() + ", Age: " + getAge() + ", Credits: " + getCredits() + ", GPA: " + getGpa();
        }
    }
    
    public static void main(String[] args) {
        // Create two Student objects
        Freshman std1 = new Freshman("James", (short) 20, 12);
        Senior std2 = new Senior("John", (short) 30, 90);
        
        // ToDo 8: The senior class should have a minimum of 85 credits 
        if (std2.getCredits() < 85) {
            std2.setCredits(85);
        }
        
        // ToDo 11: Set the gpa of the student using the scanner and user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the GPA for student two: ");
        double gpa = scanner.nextDouble();
        std2.setGpa(gpa);
        
        // Print the output
        System.out.println(std1);
        System.out.println(std2);
        
        // ToDo 12: add comments and explain your code
        
        // ToDo 13: submit using a pull request.
    }
}