module com.service.tour.chile {
    requires com.service.tour.api;
    provides com.service.tour.api.Tour with com.service.tour.chile.ChileTour;
 }