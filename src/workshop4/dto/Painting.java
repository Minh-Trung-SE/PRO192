package workshop4.dto;

import java.util.Scanner;

public class Painting extends Item {
    public int  height;
    public int  width;
    public boolean   isWatercolour;
    public boolean   isFramed;

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting() {

    }

    public void inputPainting(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a height: ");
        height = sc.nextInt();
        System.out.print("Input a width: ");
        width = sc.nextInt();
        System.out.print("Enter water value (true/false): ");
        isWatercolour = sc.nextBoolean();
        System.out.print("Enter framed value (true/false): ");
        isFramed = sc.nextBoolean();
    }

    public void outputPainting(){
        output();
        System.out.print("\nHeight: " + height);
        System.out.print("\nWidth: " + width);
        System.out.print("\nWater Colour: " + isWatercolour);
        System.out.print("\nFramed: " + isFramed);
    }

}
