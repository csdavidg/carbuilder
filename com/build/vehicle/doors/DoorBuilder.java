package build.vehicle.doors;

import build.vehicle.glasses.Glass;
import build.vehicle.glasses.GlassBuilder;

public class DoorBuilder {

    public static Door buildDoor() {
        Glass glass = GlassBuilder.buildGlass();
        return new Door(10, glass);
    }
}
