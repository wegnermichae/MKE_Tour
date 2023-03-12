package mketour.actors;

import javafx.scene.image.Image;
import javafx.scene.text.Text;
import mketour.CityMap;

public class MuseumObserver implements Observer{
    @Override
    public void update(CityMap cityMap) {
        Text museumPicture = new Text();
        //Image image = new Image("src\\mketour\\img\\wood-gatherer.png");
        museumPicture.setText("Supposed to be art image");

    }
}
