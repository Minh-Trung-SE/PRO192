package lab;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {

        public static void main(String[] args){
            Three three = new Three();
            System.out.println(three instanceof One);
        }
}

class One{
    public static void print(){
        System.out.println("1");
    }
}

class Two extends One{
    public static void print(){
        System.out.println("2");
    }
}

class Three extends Two{

}
