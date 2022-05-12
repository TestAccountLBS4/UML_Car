
/**
 * @author Hasan Kozljak
 * implemented from Star UML-Diagramm
 * created on 05.05.2022
 */
public class Engine {

    /**
     * Default constructor
     */
    public Engine() {
    }

    /**
     * 
     */
    protected int hp;

    /**
     * 
     */
    protected boolean isOn;


    /**
     * @return  hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param value setter for hp
     */
    public void setHp(int value) {
        this.hp = value;
    }

    /**
     * @return  isOn
     */
    public boolean getIsOn() {
        return isOn;
    }

    /**
     * @param value setter for isOn
     */
    public void setIsOn(boolean value) {
        this.isOn = value;
    }

}