package workshop3;

public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public Car() {
    }

    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }

    public void output(){
        System.out.println("Colour: " + colour +
                "\n EnginePower: " + enginePower +
                "\n Convertible: " + convertible +
                "\n Parking Brake: " + parkingBrake );

    }

    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", enginePower=" + enginePower +
                ", convertible=" + convertible +
                ", parkingBrake=" + parkingBrake +
                '}';
    }
}
