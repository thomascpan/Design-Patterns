package my_implementation.creational.factory_method;

/**
 * Created by thomaspan on 4/24/17.
 */
public abstract class Food {
    private int cost;
    private int tastiness;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTastiness() {
        return tastiness;
    }

    public void setTastiness(int tastiness) {
        this.tastiness = tastiness;
    }
}
