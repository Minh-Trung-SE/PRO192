package workshop2;

import java.util.Scanner;

public class Part2_2 {
    public String inputString() throws Exception {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        string = scanner.nextLine();
        string = string.toUpperCase();
        if(!string.matches("SE+[0-9]{6}")){
            throw new Exception();
        }
        return string;
    }

    public static void main(String[] args) {
        boolean flag = false;
        Part2_2 object = new Part2_2();
        do{
            try {
                String studentId = object.inputString();
                System.out.println("Student ID: " + studentId);
                flag = false;
            }catch (Exception exception){
                System.out.println("StudentID invalid");
                flag = true;
            }
        } while (flag);
    }
}
