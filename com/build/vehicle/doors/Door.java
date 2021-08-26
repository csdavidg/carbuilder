package com.build.vehicle.doors;

import com.build.vehicle.glasses.Glass;

public class Door {

    private int size;
    private Glass glass;

    public Door(int size, Glass glass) {
        this.size = size;
        this.glass = glass;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    @Override
    public String toString() {
        return "Door{" +
                "size=" + size +
                ", glass=" + glass +
                '}';
    }
}
