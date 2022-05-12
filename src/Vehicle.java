/**
 * @author Hasan Kozljak
 * implemented from Star UML-Diagramm
 * created on 05.05.2022
 */
@SuppressWarnings("unused")
public class Vehicle extends Engine{

    /**
     * Default constructor
     */
    public Vehicle() {
    }

    /**
     *
     */
    protected String serielNumber;

    /**
     *
     */
    protected String color;

    /**
     *
     */
    protected double price;

    /**
     *
     */
    protected int radioVolume;

    /**
     *
     */
    protected int drivingSpeed;


    /**
     * @param carStatus method to start and turn off the car
     */
    protected void startStopAutomatic(boolean carStatus) {
        if(carStatus){
            setIsOn(false);
            System.out.println("Shutting car off...");
        }else{
            setIsOn(true);
            System.out.println("Turning car on...");
        }
    }

    /**
     * methode to increase volume
     * @deprecated
     * added new class where volume is dynamic
     */
    @Deprecated
    protected void increaseVolumeBy5() {
        setRadioVolume(getRadioVolume() + 5);
        System.out.println("Radiovolume: " + getRadioVolume());
    }
    protected void increaseVolumeByUser(int volumeToIncrease) {
    }

    /**
     * methode to decrease volume, checks if is at 0
     */
    protected void decreaseVolumeBy5() {
        if (getRadioVolume() == 0 || (getRadioVolume() - 5) < 0){
            System.out.println("Radiovolume cant go below 0");
        }else {
            setRadioVolume(getRadioVolume() - 5);
            System.out.println("Radiovolume: " + getRadioVolume());
        }
    }

    /**
     * accelerating the car with max speed at 200
     */
    protected void accelerateCar() {
        if (getIsOn()) {
            if (drivingSpeed >= 200) {
                System.out.println("Limit reached, car cant go any faster");
            } else {
                drivingSpeed += 10;
            }
        }else{
            System.out.println("Car is off...");
        }
    }

    /**
     * slow down the car, check if car is moving
     */
    protected void brake() {
        if(drivingSpeed <= 0){
            System.out.println("The car stands still...");
        }else{
            drivingSpeed -= 10;
        }
    }

    /**
     * @return  radioVolume
     */
    public int getRadioVolume() {
        return radioVolume;
    }

    /**
     * @param value setter for radioVolume
     */
    public void setRadioVolume(int value) {
        this.radioVolume = value;
    }

    /**
     * @return drivingSpeed
     */
    public int getDrivingSpeed() {
        return drivingSpeed;
    }

    /**
     * @param value setter for drivingSpeed
     */
    public void setDrivingSpeed(int value) {
        this.drivingSpeed = value;
    }

    /**
     * @return serielNumber
     */
    public String getSerielNumber() {
        return serielNumber;
    }

    /**
     * @param value setter for serielNumber
     */
    public void setSerielNumber(String value) {
        this.serielNumber = value;
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param value setter for color
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * @return  price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param value setter for price
     */
    public void setPrice(double value) {
        this.price = value;
    }
}