package workshop1;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        String[] listName = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.print("Enter name [" + (i + 1) + "]: ");
            listName[i] = scanner.nextLine();
        }
        //Upper case
        for(String name: listName){
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
            System.out.println(name);
        }
        //Title case
        for(String name: listName){
            //store each character of the name into array.
            char[] charArrayName = name.toCharArray();
            boolean foundSpace = true;
            // Processing
            for(int i=0 ; i< charArrayName.length; i++){
                if(Character.isLetter(charArrayName[i])) {
                    if(foundSpace){
                        charArrayName[i] = Character.toUpperCase(charArrayName[i]);
                        foundSpace =false;
                    }
                } else{
                    foundSpace = true;
                }
            }
            // convert the charArray of name to Sting
            name= String.valueOf(charArrayName);
            System.out.println("After Capital: "+ name);
        }
    }
}
