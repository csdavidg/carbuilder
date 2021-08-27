module com.build.vehicle.car {
    //Not required because door has a requires transitive with glasses
    //requires com.build.vehicle.glasses; 
    requires com.build.vehicle.doors;
    requires com.build.vehicle.tires;
    
    //SERVICE MODULES DEPENDENCIES
    //requires com.service.tour.api;
    requires com.service.tour.locator;
}