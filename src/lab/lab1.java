package lab;

import java.util.Scanner;

public class lab1 {
    public static double Area(double Length, double Width) {
        double area;
        area = Length * Width;
        return area;
    }

    public static double Cir(double Length, double Width) {
        double cir;
        cir = (Length + Width) * 2;
        return cir;
    }

    public static void main(String[] args) {
        double Length, Width;
        double Area, Cir;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = ");
        Length = sc.nextDouble();
        System.out.print("Enter the width = ");
        Width = sc.nextDouble();
        Area = Area(Length, Width);
        System.out.println("The Area = " + Area);
        Cir = Cir(Length, Width);
        System.out.println("The Circumference = " + Cir);
    }
}