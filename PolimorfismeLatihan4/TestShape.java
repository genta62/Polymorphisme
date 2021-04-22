package PolimorfismeLatihan4;

/**
 *
 * @author genta
 */
public class TestShape {
    public static void main(String[] args) {
        Shape S1 = new Rectangle("red",4,5);
        System.out.println(S1);
        System.out.println("Area is "+S1.getArea());
        Shape S2 = new Triangle("blue",4,5);
        System.out.println(S2);
        System.out.println("Area is "+S2.getArea());
        
        
    }
}
