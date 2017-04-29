package my_implementation.structural.flyweight;

/**
 * Created by thomaspan on 4/26/17.
 */
public class MechaFactory {
    Mecha mecha;


    // Get Flyweight
    public Mecha getMecha(String head, String body, String arms, String legs) {
        mecha = new Mecha(head, body, arms, legs);
        return mecha;
    }
}
