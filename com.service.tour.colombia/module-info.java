module com.service.tour.colombia {
    requires com.service.tour.api;
    provides com.service.tour.api.Tour with com.service.tour.colombia.ColombianTour;
 }