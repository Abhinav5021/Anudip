
// Assignment-1. ● Create a class Student in Student.java then add member variables studentName, collegeName of type String
// ● Add a member variable studentID of type int. ● Make all the member variables as private.
// ● Add a main method. And print a message “Successful”. ● Compile the class ● Run the class (Follow Coding convention)

import java.util.Scanner;

public class Student {

    private String studentName, collegeName;
    private int studentID;

    void getData(String name, String college, int ID) {
        studentName = name;
        collegeName = college;
        studentID = ID;
    }

    void displayData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println("Student ID: " + studentID);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.println("Enter College Name : ");
        String college = sc.nextLine();
        System.out.println("Enter Student ID : ");
        int ID = sc.nextInt();

        s.getData(name, college, ID);
        s.displayData();
        System.out.println("\n\nSuccessful..");

    }

}

// Output :
// Enter Student Name :
// Abhinav S Pawar
// Enter College Name :
// DYPTC
// Enter Student ID :
// 24238
// Student Name: Abhinav S Pawar
// College Name: DYPTC
// Student ID: 24238

// Successful..