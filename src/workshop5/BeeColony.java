package workshop5;

public class BeeColony extends Colony implements Role{
    public String type;

    public BeeColony() {
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    @Override
    public String toString() {
        return "The colony’s type is " + type +
                " size is about " + size +
                " the place is” " + place;
    }

    @Override
    public void createWork() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
