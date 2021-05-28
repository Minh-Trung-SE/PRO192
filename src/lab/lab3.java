package lab;

import java.util.HashMap;
import java.util.Scanner;

public class lab3 {
    public void checkValidNumber(){
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        while (true){
            try {
                System.out.print("Enter number: ");
                number = Integer.parseInt(scanner.nextLine());
                if(number > 100){
                    throw new Exception();
                }
                int i = 2;
                while (i <= number){
                    sum = sum + i;
                    i = i + 2;
                }
                System.out.println("Number input is " + number);
                System.out.println("Sum: " + sum);
                break;
            }catch (Exception e){
                System.out.println("Invalid!");
            }
        }
    }
    public void showDayWeek(){
        HashMap<Integer, String>  week= new HashMap<>();
        week.put(1, "Sunday ");
        week.put(2,"Monday");
        week.put(3, "Tuesday");
        week.put(4, "Wednesday");
        week.put(5, "Thursday");
        week.put(6, "Friday");
        week.put(7, "Saturday");
        Scanner scanner = new Scanner(System.in);
        int day;
        do{
            try {
                System.out.print("Enter number 1 - 7: ");
                day = Integer.parseInt(scanner.nextLine());
                if(day >= 1 && day <=7){
                    System.out.println(week.get(day));
                    break;
                }
            }catch (Exception e) {
                System.out.println("Invalid!");
            }
        }while (true);
    }
    public void sumOdd(){
        int numberStart, numberEnd, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number start: ");
        numberStart = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number end: ");
        numberEnd = Integer.parseInt(scanner.nextLine());
        while (numberStart <= numberEnd) {
            if(numberStart % 2 == 1){
                sum = sum + numberStart;
            }
            numberStart++;
        }
        System.out.println("Sum even number = " + sum);
    }
    public void sumEven(){
        int numberEnd, numberSumElement, sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number > 20: ");
            numberEnd = Integer.parseInt(scanner.nextLine());
        }while (numberEnd < 20);

        System.out.print("Enter number element to add: ");
        numberSumElement = Integer.parseInt(scanner.nextLine());
        for(int i = 2; i <= numberEnd;){
            sum = sum + i;
            i = i + 2;
            numberSumElement--;
            if (numberSumElement == 0){
                break;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        lab3 lab3 = new lab3();
        lab3.checkValidNumber();
        lab3.showDayWeek();
        lab3.sumEven();
        lab3.sumOdd();
    }
}
