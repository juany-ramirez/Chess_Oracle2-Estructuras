package Clases;

public class Posicion {

    private int x; //row
    private int y; //column

    public Posicion(int x) {
        this(x, 0);
    }

    public Posicion() {
        this(0, 0);
    }

    public Posicion(Posicion pos) {
        int x1 = pos.getX();
        int y1 = pos.getY();
        
        if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) { //validacion out of bounds
            this.x = x;
            this.y = y;
        }
    }
    
    public Posicion(int x, int y) {
        if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) { //validacion out of bounds
            this.x = x;
            this.y = y;
        }
    }

    public final String toString() {
        String str;
        return str = "(" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if ((x >= 0 && x <= 7)) { //validacion out of bounds
            this.x = x;
        }
    }

    public void setY(int y) {
        if ((y >= 0 && y <= 7)) { //validacion out of bounds
            this.y = y;
        }
    }
}
