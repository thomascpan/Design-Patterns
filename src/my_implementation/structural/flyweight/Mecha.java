package my_implementation.structural.flyweight;

/**
 * Created by thomaspan on 4/26/17.
 */
public class Mecha {
    private String head;
    private String body;
    private String arms;
    private String legs;

    public Mecha(String head, String body, String arms, String legs) {
        this.head = head;
        this.body = body;
        this.arms = arms;
        this.legs = legs;
    }

    public void attack(Weapon weapon) {
        if (weapon.getTotalDamage() > 100) {
            System.out.println("Pow Pow! You did " + weapon.getTotalDamage() + " damage!");
        } else {
            System.out.println("Pew pew! You did " + weapon.getTotalDamage() + " damage!");
        }
    }
}
