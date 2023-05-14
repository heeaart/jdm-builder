package director;

import builder.Builder;
import product.engine.Engine;

public class Director {

    public void makeMazdaRX7(Builder builder){
        builder.reset();
        builder.setColor("black");
        builder.setDoors(2);
        builder.setSits(5);
        builder.setWeight(1260);
        Engine engine = new Engine();
        engine.setCapacity(1300);
        engine.setPower(400);
        engine.setType("wankl");
        engine.setTypeOfFuel("petrol");
    }

    public void makeSkyLiner34  (Builder builder)
    {
        builder.reset();
        builder.setColor("blue");
        builder.setDoors(2);
        builder.setSits(5);
        builder.setWeight(1560);
        Engine engine = new Engine();
        engine.setCapacity(1300);
        engine.setPower(800);
        engine.setType("6-cyl, twin-turbo");
        engine.setTypeOfFuel("petrol");

    }
}