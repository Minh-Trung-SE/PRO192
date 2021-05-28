package lab;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService1 {

    public static void main(String[] args) {
        String studentId, fullName;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter StudentID: ");
            studentId = scanner.nextLine();
            System.out.print("Enter fullName: ");
            fullName = scanner.nextLine();
            Student student = new Student(studentId, fullName);
            System.out.println(student.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
