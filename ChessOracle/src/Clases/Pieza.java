package Clases;

public abstract class Pieza {

    protected byte color;
    protected Posicion posicion = new Posicion();

    public Pieza(byte color, int x) {
        this(color, x, 0);
    }

    public Pieza(byte color) {
        this(color, 0, 0);
    }

    public Pieza() {
        
    }

    public Pieza(byte color, int x, int y) {
        this.color = color;
        this.posicion = new Posicion(x, y);
    }

    public final byte getColor() {
        return color;
    }

    public final Posicion getPosicion() {
        return posicion;
    }

    public final void setColor(byte color) {
        this.color = color;
    }

    public final void setPosicion(Posicion posicion) {
        this.posicion=posicion;
    }

    public abstract boolean movimientoValido(Pieza[][] NamelessParameter1, Posicion NamelessParameter2);

    public String toString() {
        String retval = "";
        return retval;
    }
}
