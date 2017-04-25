package my_implementation.creational.prototype;

/**
 * Created by thomaspan on 4/24/17.
 */
public class Hamburger extends Food {
    private int cost = 5;
    private int tastiness = 0;

    public Hamburger(int tastiness) {
        this.tastiness = tastiness;
    }

    @Override
    public Food clone(int tastiness) {
        return new Hamburger(tastiness);
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "cost=" + cost +
                ", tastiness=" + tastiness +
                '}';
    }
}
