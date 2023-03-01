/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
    public static void main(String[] args) {
        // Create two classes for Freshman and Senior
        class Freshman {
            String name;
            int age;
            int credits;
            
            public Freshman(String name, int age, int credits) {
                this.name = name;
                this.age = age;
                this.credits = credits;
            }

            public String toString() {
                return "Name: " + name + " Age: " + age + " Credits: " + credits;
            }
        }

        class Senior {
            String name;
            int age;
            int credits;
            double gpa;

            public Senior(String name, int age, int credits, double gpa) {
                this.name = name;
                this.age = age;
                this.credits = credits;
                this.gpa = gpa;
            }

            public String toString() {
                return "Name: " + name + " Age: " + age + " Credits: " + credits + " GPA: " + gpa;
            }
        }

        // Create two Student objects
        Freshman std1 = new Freshman("James", 20, 12);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the GPA for student two: ");
        double gpa = scanner.nextDouble();
        Senior std2 = new Senior("John", 30, 90, gpa);

        // Print the output
        System.out.println(std1);
        System.out.println(std2);
    }
}