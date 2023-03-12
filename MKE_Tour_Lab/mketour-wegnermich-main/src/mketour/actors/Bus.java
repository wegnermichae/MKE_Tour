/*
 * Course:     SE 2811
 * Term:       Winter 2021-22
 * Assignment: MKETour
 * Author:     Dr. Yoder and YOUR NAME HERE
 */
package mketour.actors;

import javafx.scene.image.Image;
import mketour.CityMap;

/**
 * Simplification (!) of the Milwaukee County Transit System.
 * A Mobile Entity that drives in a fixed rectangular loop.
 * Although the buses start off of the loop, they quickly find it.
 */
public class Bus extends MobileEntity {
    private static final Image BUS_IMAGE =
            new Image(CityMap.class.getResource("img/bus.png").toString());

    /** x coordinates of the bus's route */
    public static final int LEFT_EDGE = 100;
    public static final int RIGHT_EDGE = 600;

    /** y coordinates of the bus's route */
    public static final int TOP_EDGE = 50;
    public static final int BOTTOM_EDGE = 400;

    private Subject subject = new Subject();
    private CityMap cityMap = new CityMap();

    public Bus(CityMap cityMap) {
        super(cityMap, BUS_IMAGE);
        setName("Bus "+ MobileEntity.instanceCount);
        subject.attach(new BusObserver());
    }

    /**
     * Take one simulation step forward, towards or continuing to follow the loop.
     */
    @Override
    protected void step() {
        super.step();
        checkBounds(LEFT_EDGE, RIGHT_EDGE, TOP_EDGE, BOTTOM_EDGE);
    }

    @Override
    public void taggedBy(MobileEntity entity) {
        //TODO: Replace this printout with your code!
        if(this != entity && entity.getName().contains("You")){
            subject.notifyUpdate(cityMap);
        }
        if ( CityMap.DEBUG_LEVEL > 0 )
            System.out.println(this + " tagged by  " + entity);
    }
}
