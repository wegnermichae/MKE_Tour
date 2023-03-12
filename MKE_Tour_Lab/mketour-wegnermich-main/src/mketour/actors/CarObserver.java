package mketour.actors;

import mketour.CityMap;

import java.util.ArrayList;
import java.util.List;

public class CarObserver implements Observer{
    @Override
    public void update(CityMap cityMap) {
        System.out.println(cityMap.getMobileEntities());
    }
}
