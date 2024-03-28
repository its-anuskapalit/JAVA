//day24
//Arraylist -(implements)->List -(extends)->Collection --> root
//we use Arraylist class to implement the functionality of resizable array it automatically adjust capacity to 4add or remove elements from it thus call Dynamic Array.
import java.util.*;
class online{
    public static  void main(String args[]){
        //ArrayList<int> test = new ArrayList<>();
        // cannot use primitive datatype
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            test.add(i);
        }
        System.out.println("Array 1:" + test);

    }
}
//--------------------------------------------------------------------------------------
import java.util.*;
class online{
    public static  void main(String args[]){
        ArrayList<String>  a1 = new ArrayList<>();
        a1.add("Mercury");
        a1.add("Venus");
        a1.add("Earth");
        a1.add("Mars");
        ArrayList<String> a2= (ArrayList<String>)a1.clone();
            System.out.println(a2);
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class online{
    public static  void main(String args[]){
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Mercury");
        a1.add("Venus");
        a1.add("Earth");
        a1.add("Mars");
        System.out.println(a1);
        a1.add(1,"Jupiter");
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(a1.get(2));
        a1.set(2,"Pluto");
        System.out.println(a1);
        a1.remove(1);
        System.out.println(a1);
    }
}
OUPUT
[Mercury, Venus, Earth, Mars]
[Mercury, Jupiter, Venus, Earth, Mars]
5
Venus
[Mercury, Jupiter, Pluto, Earth, Mars]
[Mercury, Pluto, Earth, Mars]
[]
//--------------------------------------------------------------------------------------------------------------------
import java.util.*;
class online{
    public static  void main(String args[]){
        ArrayList<String>  a1 = new ArrayList<>();
        a1.add("Mercury");
        a1.add("Venus");
        a1.add("Earth");
        a1.add("Mars");

        for (int i = 0; i < a1.size(); i++){
            System.out.println(a1.get(i));
        }

    }
}
//----------------------------------------------------------------
import java.util.*;
class online{
public static void main(String args[]){
ArrayList<String> a1 = new ArrayList<>();
a1.add("Mercury");
a1.add("Venus");
a1.add("Earth");
a1.add("Mars");
Collections.swap(a1, 1, 2);
System.out.println(a1);
}
}
[Mercury, Earth, Venus, Mars]
//-------------------------------------------------------------------
// Create a Java program to manage a list of student names using ArrayList. The program should allow users to add new student names, remove existing student names, and display all student names.
// Your program should include the following methods:
// addStudent(String name): This method adds a new student name to the list.
// removeStudent(String name): This method removes a student name from the list.
// displayAllStudents(): This method displays all the student names stored in the list.
// Write a Java program that implements the above methods and demonstrates their functionality.

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<String> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    // Method to add a new student name to the list
    public void addStudent(String name) {
        studentList.add(name);
        System.out.println("Student '" + name + "' added successfully.");
    }

    // Method to remove a student name from the list
    public void removeStudent(String name) {
        if (studentList.remove(name)) {
            System.out.println("Student '" + name + "' removed successfully.");
        } else {
            System.out.println("Student '" + name + "' not found.");
        }
    }

    // Method to display all the student names stored in the list
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("List of students:");
            for (String student : studentList) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String addName = scanner.nextLine();
                    manager.addStudent(addName);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeStudent(removeName);
                    break;
                case 3:
                    manager.displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}

//--------------------------------------------------------------------------------------------------------
