import builder.CarBuilder;
import builder.ManualBuilder;
import director.Director;
import product.Car;
import product.CarManual;
/*
TODO:
* dodać samochod
* w main otwerac samochody
* wyslac link na teams

 */
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();


        director.makeSkyLiner34(builder);
        Car car = builder.getResult();
        director.makeSkyLiner34(manualBuilder);
        CarManual manualSkyLiner34 = manualBuilder.getResult();


        director.makeMazdaRX7(builder);
        Car car1 = builder.getResult();
        director.makeMazdaRX7(manualBuilder);
        CarManual manualMazdaRX7 = manualBuilder.getResult();



        System.out.println(car.toString());
        System.out.println(manualSkyLiner34.getContent());


        System.out.println(car1.toString());
        System.out.println(manualMazdaRX7.getContent());
    }
}