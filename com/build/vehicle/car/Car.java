package build.vehicle.car;

import build.vehicle.doors.Door;
import build.vehicle.glasses.Glass;
import build.vehicle.tires.Tire;

public class Car {

    private Door door;
    private Tire tire;
    private Glass windscreen;

    public Car(Door door, Tire tire, build.vehicle.glasses.Glass glass) {
        this.door = door;
        this.tire = tire;
        this.windscreen = glass;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Glass getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(Glass windscreen) {
        this.windscreen = windscreen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", tire=" + tire +
                ", windscreen=" + windscreen +
                '}';
    }
}