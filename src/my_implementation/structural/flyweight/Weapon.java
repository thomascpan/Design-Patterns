package my_implementation.structural.flyweight;

/**
 * Created by thomaspan on 4/26/17.
 */
public class Weapon {
    private int level;
    private int upgrades;
    private boolean isEnchanted;

    public Weapon(int level, int upgrades, boolean isEnchanted) {
        this.level = level;
        this.upgrades = upgrades;
        this.isEnchanted = isEnchanted;
    }

    public int getTotalDamage() {
        int result = (level*upgrades);
        if (isEnchanted) {
            result = result * 2;
        }
        return result;
    }
}
