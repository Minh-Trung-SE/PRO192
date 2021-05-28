package workshop4.dto;

import java.util.Scanner;

public class Statue extends Item{
    public int weight;
    public String colour;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    public void inputStatue(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a weight: ");
        weight = sc.nextInt();
        System.out.print("Input a colour: ");
        sc.nextLine();
        colour = sc.nextLine();
    }

    public void outputStatue(){
        output();
        System.out.print("\nWeight: " + weight);
        System.out.print("\nColour: " + colour);
    }

}
