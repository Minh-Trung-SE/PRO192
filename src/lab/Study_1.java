package lab;

class Study_1A{
    protected int height;
    protected int length;
    public Study_1A() {
        height = 5;
        length = 6;
    }

    public Study_1A(int i, int i1) {
    }

    @Override
    public String toString() {
        return "Study_1A{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}

class Study_1B extends Study_1A{
    public int width;

    public Study_1B() {
        super(8, 9);
        width = 7;
    }

    @Override
    public String toString() {
        return "Study_1B{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}

public class Study_1 {
    public static void main(String[] args) {
        Study_1A objectA = new Study_1A();
        System.out.println(objectA.toString());
        objectA = new Study_1B();
        System.out.println(objectA.toString());
    }

}
