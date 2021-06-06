package workshop3;

public class Tester {
    public static void main(String[] args) {
        System.out.println("**Car 1**");
        Car c=new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        System.out.println("**Car 2**");
        Car c2=new Car("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c2:" + c2.getColour());
        c2.output();

        //********************************************************//
        System.out.println("******************************************************");
        Guitar obj1=new Guitar();
        Guitar obj2=new Guitar("G123",2000,"Sony","Model123","hardWood","softWood");
        System.out.println("State of obj1:");
        obj1.createSound();
        System.out.println("State of obj2:");
        obj2.createSound();

        System.out.println("set price = 3000 of obj1");
        obj1.setPrice(3000);
        System.out.println("get price of obj1:" + obj1.getPrice() );
    }
}


