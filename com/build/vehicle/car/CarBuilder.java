package build.vehicle.car;

import build.vehicle.doors.Door;
import build.vehicle.doors.DoorBuilder;
import build.vehicle.glasses.Glass;
import build.vehicle.glasses.GlassBuilder;
import build.vehicle.tires.Tire;
import build.vehicle.tires.TireBuilder;

public class CarBuilder {

    public static void main(String[] args) {

        Tire tire = TireBuilder.buildTire();
        Door door = DoorBuilder.buildDoor();
        Glass glass = GlassBuilder.buildWideScreen();
        Car car = new Car(door, tire, glass);

        System.out.println(car);

    }


}