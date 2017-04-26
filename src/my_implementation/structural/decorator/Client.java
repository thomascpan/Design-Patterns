package my_implementation.structural.decorator;

/**
 * Created by thomaspan on 4/25/17.
 */
public class Client {
    public static void main(String[] args) {
        Character myCharacter = new StealthPowers(new FightingPowers(new MagicPowers(new BaseCharacter("Good Guy"))));
        myCharacter.action();
    }
}
