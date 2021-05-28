package workshop3;

public class Guitar {
    private String serialNumber;
    private int price;
    private String  builder;
    private String  model;
    private String backWood;
    private String  topWood;

    public Guitar() {
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if(!serialNumber.matches("")){
            this.serialNumber = serialNumber;
        }
    }

    public void createSound(){
        System.out.println("SerialNumber :" + serialNumber +
                "\n Price: " + price +
                "\n Builder: " + builder +
                "\n Model: " + model +
                "\n Back-Wood: " + backWood +
                "\n Top-Wood: " + topWood + "\n");
    }

    public int getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
}
