
public class TestMethodeFinalize {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(4, 4);
        p1 = p3;
        System.gc();
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Je suis la methode finalize.");
        System.out.println("Le Garbage Collector m'appelle automatiquement avant de détruire un objet de type Point qui n'est plus référence.");
    }
    
    
}
