package com.service.tour.chile;

import com.service.tour.api.*;

public class ChileTour implements Tour {

    public String name() {
        return "Santiago";
    }

    public int length() {
        return 120;
    }

    public Souvenir getSouvenir() {
        Souvenir gift = new Souvenir();
        gift.setDescription("Medalla Real Gold Medal 2017");
        return gift;
    }
  

}