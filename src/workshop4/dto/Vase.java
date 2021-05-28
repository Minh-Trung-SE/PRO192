package workshop4.dto;

import java.util.Scanner;

public class Vase extends Item{
    public int height;
    public  String material;

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public Vase() {

    }

    public void inputVase(){
        input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a height: ");
        height=sc.nextInt();
        System.out.print("Input a material: ");
        sc.nextLine();
        material = sc.nextLine();
    }

    public void outputVase(){
        output();
        System.out.print("\nHeight: "+ height);
        System.out.print("\nMaterial: "+ material);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
