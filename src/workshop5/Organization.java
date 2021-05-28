package workshop5;

public abstract class Organization {
    public  int size;

    public Organization() {
    }

    public Organization(int size) {
        this.size = size;
    }


    public abstract void communicateByTool();

    @Override
    public String toString() {
        return "The organization’s size is "  + size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
