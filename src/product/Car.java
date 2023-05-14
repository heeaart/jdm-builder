package product;

import product.engine.Engine;

public class Car {

    private Engine engine;
    private int numberOfDoors;
    private int numberOfSits;
    private String color;
    private int weight;


    public void setEngine(Engine engine) {
        this.engine = engine;
    }



    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }



    public void setNumberOfSits(int numberOfSits) {
        this.numberOfSits = numberOfSits;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfSits=" + numberOfSits +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}