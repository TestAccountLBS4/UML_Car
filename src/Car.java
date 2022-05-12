

/**
 * @author Hasan Kozljak
 * implemented from Star UML-Diagramm
 * created on 05.05.2022
 */
public class Car extends Vehicle{
    /**
     * Default constructor
     */
    public Car() {
    }

    /**
     * Constructor to initilaze attributes
     * @param serielNumber
     * @param color
     * @param price
     * @param hp
     * @param carBody
     * @param hasSensors
     */
    public Car(String serielNumber, String color, double price, int hp, String carBody, boolean hasSensors){
        this.serielNumber = serielNumber;
        this.color = color;
        this.price = price;
        this.hp = hp;
        this.carBody = carBody;
        this.hasSensors = hasSensors;
    }

    /**
     *
     */
    private String carBody;

    /**
     * 
     */
    private boolean hasSensors;


    /**
     * @return carBody
     */
    public String getCarBody() {
        return carBody;
    }

    /**
     * @param value setter for carBody
     */
    public void setCarBody(String value) {
        this.carBody = value;
    }

    /**
     * @return hasSensors
     */
    public boolean getHasSensors() {
        return hasSensors;
    }

    /**
     * @param value setter for hasSensors
     */
    public void setHasSensors(boolean value) {
        this.hasSensors = value;
    }

    @Override
    public void increaseVolumeByUser(int volumeToIncrease) {
        setRadioVolume(getRadioVolume() + volumeToIncrease);
        System.out.println("Radiovolume: " + getRadioVolume());
    }

    @MyAnnotation()
    public void test() {}

}