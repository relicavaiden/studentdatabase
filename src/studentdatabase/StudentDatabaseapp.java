package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseapp {
    public static void main(String[] args) {
        // Ask how many students we want to add

        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}