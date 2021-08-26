package com.build.vehicle.car;

import com.build.vehicle.doors.Door;
import com.build.vehicle.doors.DoorBuilder;
import com.build.vehicle.glasses.Glass;
import com.build.vehicle.glasses.widescreens.WideScreenBuilder;
import com.build.vehicle.tires.Tire;
import com.build.vehicle.tires.TireBuilder;
import com.service.tour.locator.TourFinder;
import com.service.tour.api.Tour;

import java.util.*;

public class CarBuilder {

    public static void main(String[] args) {

        Tire tire = TireBuilder.buildTire();
        Door door = DoorBuilder.buildDoor();
        Glass glass = WideScreenBuilder.build();
        Car car = new Car(door, tire, glass);

        System.out.println(car);

        Tour tour = TourFinder.findSingleTour();
        System.out.println("Single tour: " + tour);

        List<Tour> tours = TourFinder.findAllTours();
        System.out.println("# tours: " + tours.size());

        TourFinder.findAllTours()
                .stream()
                .map(s -> s.getSouvenir().getDescription())
                .forEach(System.out::println);

    }


}