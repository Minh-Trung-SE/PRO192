import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int pack, distance;
        int shift, feedback;
        int call, electric;
        int other;
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter package number: ");
        pack = sc.nextInt();
        System.out.print("Enter distance number: ");
        distance = sc.nextInt();
        System.out.print("Enter shift night number: ");
        shift = sc.nextInt();
        System.out.print("Enter feedback grade: ");
        feedback = sc.nextInt();
        System.out.print("Enter the call amount: ");
        call = sc.nextInt();
        System.out.print("Enter the electricity payment: ");
        electric = sc.nextInt();
        System.out.print("Enter the other payment: ");
        other = sc.nextInt();
        salary = pack * 50 + distance * 75 + shift * 50 * 0.1 + feedback + call + electric + other;
        System.out.println("The salary is " + salary);
    }
}
