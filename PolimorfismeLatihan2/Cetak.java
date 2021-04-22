package PolimorfismeLatihan2;

/**
 *
 * @author genta
 */
public class Cetak {
    public static void main(String[] args) {
        Line garis1 = new Line(10,20,30,40);
        Line garis2 = new Line(10,20,30,40);
        garis1.getLenght();
        garis2.getLenght();
        
        System.out.println("garis1>garis2 = "+garis1.isGreater(garis1, garis2));
        System.out.println("garis1<garis2 = "+garis1.isLess(garis1, garis2));
        System.out.println("garis1==garis2 = "+garis1.isEqual(garis1, garis2));
    }
}
