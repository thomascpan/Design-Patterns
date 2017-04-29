package my_implementation.structural.flyweight;

/**
 * Created by thomaspan on 4/26/17.
 */
public class Client {
    public static void main(String[] args) {
        Weapon theSword = new Weapon(10, 5, false);
        Weapon thePen = new Weapon(50, 3, true);

        MechaFactory mechaFactory = new MechaFactory();

        Mecha mecha = mechaFactory.getMecha("Normal head", "Armored body", "Upgraded arms", "Normal legs");

        mecha.attack(theSword);

        mecha.attack(thePen);
    }
}
