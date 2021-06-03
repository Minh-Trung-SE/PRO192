package fu.main;

import java.util.Scanner;

public class MyToys {
    public  static final double PI = 3.15;
    public  static final double VAT = 0.1;
    public  static final int MAX_ELEMENTS = 500;
    private static final Scanner scanner = new Scanner(System.in);
    public  static int getAnInteger(){
        int integerNumber;
        do{
           try {
               System.out.print("Input an integer: ");
               integerNumber = Integer.parseInt(scanner.nextLine());
               return integerNumber;
           }catch (Exception exception){
               //Exception new Exception
               System.out.println("Input again!");
           }
        }while (true);
    }
    public  static int getAnInteger(String notification){
        int integerNumber;
        do{
            try {
                System.out.print(notification);
                integerNumber = Integer.parseInt(scanner.nextLine());
                return integerNumber;
            }catch (Exception exception){
                //Exception new Exception
                System.out.println("Input again!");
            }
        }while (true);
    }

}
