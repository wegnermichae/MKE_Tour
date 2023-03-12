package mketour.actors;

import mketour.CityMap;

public interface Observer {
    void update(CityMap cityMap);
}
