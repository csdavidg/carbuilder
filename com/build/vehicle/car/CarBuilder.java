package com.build.vehicle.car;

import com.build.vehicle.doors.Door;
import com.build.vehicle.doors.DoorBuilder;
import com.build.vehicle.glasses.Glass;
import com.build.vehicle.glasses.GlassBuilder;
import com.build.vehicle.tires.Tire;
import com.build.vehicle.tires.TireBuilder;

public class CarBuilder {

    public static void main(String[] args) {

        Tire tire = TireBuilder.buildTire();
        Door door = DoorBuilder.buildDoor();
        Glass glass = GlassBuilder.buildWideScreen();
        Car car = new Car(door, tire, glass);

        System.out.println(car);

    }


}