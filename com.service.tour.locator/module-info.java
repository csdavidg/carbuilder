module com.service.tour.locator {
    exports com.service.tour.locator;
    requires transitive com.service.tour.api;
    uses com.service.tour.api.Tour;
 }