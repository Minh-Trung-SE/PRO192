package workshop4.dto;

import java.util.Scanner;

public class Item {
    public int value;
    public String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public void output(){
        System.out.print("Value: " + value);
        System.out.print("\nCreator: " + creator);
    }
    public void input(){
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        do{
            try {
                System.out.print("Input value: ");
                value = Integer.parseInt(scanner.nextLine());
                if(value > 0){
                    break;
                }
            }catch (Exception e){
                System.out.println("Invalid value!");
            }
        }while (true);
        do {
            System.out.print("Input creator: ");
            scanner.nextLine();
            creator = scanner.nextLine();
            if(value > 0 && creator.isEmpty()){
                System.out.println("Creator filed require not-null, enter again!");
                flag = true;
            }else{
                flag = false;
            }
        }while (flag);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
