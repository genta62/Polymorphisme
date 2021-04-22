package Praktikum;

/**
 *
 * @author genta
 */
public class TestRect {
    public static void main(String[] args) {
         Rect p = new Rect(1, 1, 4, 4);
        int a = p.x1;
        int b = p.x2;
        int c = p.y1;
        int d = p.y2;
        Rect q = new Rect(5, 6);
        p.move(1, 2);

        System.out.println("<" + p.x1 + "," + p.y1 + " is inside the union");
        System.out.println("[" + a + "," + b + ": " + c + "," + d + "] union [" + p.x1 + "," + p.y1 + "; " + p.x2 + "," + p.y2 + "] = [" + a + "," + b + "; " + p.x2 + "," + p.y2 + "]");
        System.out.println("[" + a + "," + b + ": " + c + "," + d + "] union [" + p.x1 + "," + p.y1 + "; " + p.x2 + "," + p.y2 + "] = [" + p.x1 + "," + p.y1 + "; " + c + "," + d + "]");
    }
}
