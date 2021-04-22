package PolimorfismeLatihan4;

/**
 *
 * @author genta
 */
public class Shape {
    // private member variable 
    private String color;
    //construktor
    public Shape (String color) {
        this.color=color;
    }
    @Override
    public String toString() {
        return "Shape[color = "+color+"]";
    }
    //all shapes must have a method acalledd gerAr()
    public double getArea() {
        //we need to return some value to compile the program.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}