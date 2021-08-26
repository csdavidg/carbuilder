package com.build.vehicle.doors;

import com.build.vehicle.glasses.Glass;
import com.build.vehicle.glasses.windows.WindowBuilder;

public class DoorBuilder {

    public static Door buildDoor() {
        Glass glass = WindowBuilder.build();
        return new Door(10, glass);
    }
}
