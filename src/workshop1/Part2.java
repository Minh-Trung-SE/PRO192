package workshop1;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        float number1, number2;
        char operator;
        boolean flag  = true;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter value number 1: ");
                number1 = Float.parseFloat(scanner.nextLine());
                System.out.print("Enter value number 2: ");
                number2 = Float.parseFloat(scanner.nextLine());
                break;
            }catch (Exception exception){
                System.out.println("Invalid value, input again");
            }
        }
        do {
            System.out.print("Enter operator: ");
            operator = scanner.nextLine().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println(number1 + " + " + number2 + " = " + (number2 + number1));
                    flag = false;
                    break;
                case '-':
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                    flag = false;
                    break;
                case '*':
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                    flag = false;
                    break;
                case '/':
                    flag = false;
                    if(number2 == 0){
                        System.out.println("Can't division  for zero");
                        break;
                    }
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                    break;
                default:
                    System.out.println("Enter again");
            }
        }while (flag);
    }
}
