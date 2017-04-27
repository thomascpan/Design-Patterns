package my_implementation.structural.composite;

/**
 * Created by thomaspan on 4/26/17.
 */
public class Client {
    public static void main(String[] args) {
        Shape s1 = new Sphere();
        Shape s2 = new Sphere();
        Shape s3 = new Sphere();

        Shape c1 = new Cube();
        Shape c2 = new Cube();
        Shape c3 = new Cube();

        Composite comp1 = new Composite();
        Composite comp2 = new Composite();

        comp1.add(s1);
        comp1.add(s2);
        comp1.add(c1);

        comp2.add(s3);
        comp2.add(c2);
        comp2.add(c3);
        comp2.add(comp1);

        comp2.whoIs();



    }
}
