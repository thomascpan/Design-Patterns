package my_implementation.creational.prototype;

/**
 * Created by thomaspan on 4/24/17.
 */
public class Fries extends Food {
    private int cost = 1;
    private int tastiness = 0;

    public Fries(int tastiness) {
        this.tastiness = tastiness;
    }

    @Override
    public Food clone(int tastiness) {
        return new Fries(tastiness);
    }

    @Override
    public String toString() {
        return "Fries{" +
                "cost=" + cost +
                ", tastiness=" + tastiness +
                '}';
    }
}
