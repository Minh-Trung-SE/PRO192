package lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exception {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 2; i++){
            for(int j =1; j <= 3; j++){
                sum = sum + (i + j);
            }
        }
        System.out.println(sum);
    }
}
