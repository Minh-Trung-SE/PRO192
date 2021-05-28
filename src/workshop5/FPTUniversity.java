package workshop5;

public class FPTUniversity extends University implements Role{
    public String address;

    public FPTUniversity() {

    }

    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }

    @Override
    public void createWork() {
        System.out.println("Providing human resources.");
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, Da Nang, CanTho, QuyNhon.";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
