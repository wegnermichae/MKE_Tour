package mketour.actors;

import mketour.CityMap;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer o) {
        observers.add(o);
    }

    public void notifyUpdate(CityMap cityMap) {
        for(Observer o: observers){
            o.update(cityMap);
        }
    }
}
