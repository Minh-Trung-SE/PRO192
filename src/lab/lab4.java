package lab;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int choice, firstNumber, secondNumber;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Java program");
        System.out.print("Enter the first number: ");
        firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the second number: ");
        secondNumber = Integer.parseInt(sc.nextLine());
        do {
            System.out.println("Select operation :");
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Mul");
            System.out.println("4.Div");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    result = firstNumber + secondNumber;
                    System.out.format("%d + %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                case 2:
                    result = firstNumber - secondNumber;
                    System.out.format("%d + %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                case 3:
                    result = firstNumber * secondNumber;
                    System.out.format("%d * %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                case 4:
                    result = (double) firstNumber / secondNumber;
                    System.out.format("%d / %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                default:
                    System.out.println("Thanks you. Good bye!");
                    System.exit(0);
            }
        } while (true);
    }
}