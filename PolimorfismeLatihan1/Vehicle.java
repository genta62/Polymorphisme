package PolimorfismeLatihan1;

/**
 *
 * @author genta
 */
public abstract class Vehicle {
    public void function(){
        System.out.println("Transportation Tools");
    }
    
    public void fuel(){
        System.out.println("Fuels");
    }
    
    public abstract void walk();
}
