import java.lang.reflect.Method;

/**
 * @author Hasan Kozljak
 * @version 1.0
 * created on 05.05.2022
 */

public class Main {
    /**
     * Mainmethode
     * @param args initilaiseiert die Testvariable
     */
    public static void main(String[] args) throws NoSuchMethodException {
        //String serielNumber, String color, double price, int hp, String carBody, boolean hasSensors
        Car audi = new Car("12345ABC","Black", 19999.99, 200, "Coupe", true);
        audi.setRadioVolume(25);
        audi.setIsOn(false);

        audi.startStopAutomatic(audi.getIsOn());
        audi.startStopAutomatic(audi.getIsOn());

        System.out.println("Radiovolume at the moment: " + audi.getRadioVolume());
        audi.increaseVolumeBy5();
        audi.increaseVolumeBy5();
        audi.increaseVolumeByUser(20);
        audi.decreaseVolumeBy5();
        audi.accelerateCar();
        audi.startStopAutomatic(audi.getIsOn());
        audi.accelerateCar();
        System.out.println("Now driving: " + audi.getDrivingSpeed() + " Km/h");
        audi.brake();
        System.out.println("Now driving: " + audi.getDrivingSpeed() + " Km/h");
        audi.brake();
        System.out.println("Car specifications: \n" +
                "Serielnumber: " + audi.getSerielNumber() +
                "\nColor: " + audi.getColor() +
                "\nPrice: " + audi.getPrice() +
                "\nHp: " + audi.getHp() +
                "\nCar Body: " + audi.getCarBody() +
                "\nDoes this car have Sensors? " + (audi.getHasSensors() ? "Yes" : "No"));

        Method m = Car.class.getMethod("test");
        MyAnnotation anno = m.getAnnotation(MyAnnotation.class);
        System.out.println(anno.value());
    }
}