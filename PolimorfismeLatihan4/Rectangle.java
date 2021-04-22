package PolimorfismeLatihan4;

/**
 *
 * @author genta
 */
public class Rectangle extends Shape {
    //private members variables
    private int length;
    private int width;
    //constructor 
    public Rectangle(String color, int length, int width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    public String toString() {
        return "Rectangle[length="+length+",width="+width+","+super.toString()+"]";
    }
    //overate the inherited getArea() to provide the proper implementatiton
    @Override
    public double getArea(){
        return length*width;
    }
}
