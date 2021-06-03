package lab;

import java.util.Scanner;

public class Array {
    private int[] array;

    public Array() {
    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.print("Enter length of array: ");
        length = scanner.nextInt();
        array = new int[length];
        for (int i = 0; i < length; i++){
            System.out.print("a[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
    }

    public void displayArray(){
        for(int i = 0; i < array.length; i++){
            System.out.println("A[" + i + "]: " + array[i]);
        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.inputValues();
        array.displayArray();
    }

}
