package workshop2;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        boolean flag = true; //Condition decide loop to attempt get true format data
        int number;
        Scanner scanner = new Scanner(System.in);
        do{ //this loop execute if input wrong data or input lest than 1
            try {
                System.out.print("Enter number: ");
                //catch string to int
                number = Integer.parseInt(scanner.nextLine());
                //if number input is lest than 1 throw exception and loop
                if(number < 1){
                    throw new Exception();
                }
                System.out.println("Value of this number is: " + number);
                flag = false; //if input correct break loop and accept value
            }catch (Exception exception){
                System.out.println("Invalid input number!");
                flag = true;
            }
        }while(flag);
    }
}

