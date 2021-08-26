package com.build.vehicle.tires;

public class Tire {

    private int size;
    private int psi;

    public Tire(int size, int psi) {
        this.size = size;
        this.psi = psi;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPsi() {
        return psi;
    }

    public void setPsi(int psi) {
        this.psi = psi;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                ", psi=" + psi +
                '}';
    }
}
