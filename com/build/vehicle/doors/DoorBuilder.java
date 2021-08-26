package com.build.vehicle.doors;

import com.build.vehicle.glasses.Glass;
import com.build.vehicle.glasses.GlassBuilder;

public class DoorBuilder {

    public static Door buildDoor() {
        Glass glass = GlassBuilder.buildGlass();
        return new Door(10, glass);
    }
}
