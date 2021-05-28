package workshop2;

import java.util.Scanner;

public class Part2_1 {
    public static void main(String[] args) {
        boolean flag = false; //condition to decide whether loop if input wrong formant
        Scanner scanner = new Scanner(System.in);
        String studentId;
        do{
            try {
                System.out.print("Enter Student ID: ");
                studentId = scanner.nextLine();
                studentId = studentId.toUpperCase();
                if(!studentId.matches("SE+[0-9]{6}")){
                    //if input wrong format it is a exception
                    throw new Exception();
                }
                System.out.println("Student ID: " + studentId);
                flag = false;
            }catch (Exception exception){
                System.out.println("Invalid!");
                flag = true; //flag loop set true and require must input again
            }
        } while (flag);
    }
}
