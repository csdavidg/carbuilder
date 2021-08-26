package build.vehicle.glasses;

public class GlassBuilder {

    public static Glass buildGlass() {
        return new Glass(10, "Black");
    }

    public static Glass buildWideScreen() {
        return new Glass(10, "Transparent");
    }

}
