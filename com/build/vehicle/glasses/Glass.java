package build.vehicle.glasses;

public class Glass {

    private int size;
    private String color;

    public Glass(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Glass{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
