package mketour.actors;

import javafx.scene.Node;
import javafx.scene.text.Text;
import mketour.CityMap;

public class BusObserver implements Observer{
    @Override
    public void update(CityMap cityMap) {
        Text busChallenge = new Text();
        String foundBus = "***";
        busChallenge.setText("Challenge: Find all the letters in BUS\nGoal: BUS\nFound:" + foundBus);
    }
}
