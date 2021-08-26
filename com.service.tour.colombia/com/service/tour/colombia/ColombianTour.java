package com.service.tour.colombia;

import com.service.tour.api.*;

public class ColombianTour implements Tour {

    public String name() {
        return "Bogota";
    }

    public int length() {
        return 120;
    }

    public Souvenir getSouvenir() {
        Souvenir gift = new Souvenir();
        gift.setDescription("BBC Beer Moserrate");
        return gift;
    }
  

}