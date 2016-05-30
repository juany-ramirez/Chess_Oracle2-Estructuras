package Clases;

public abstract class Pieza {

    protected char color;
    protected Posicion posicion = new Posicion();


    public Pieza() {
    }
    
    public Pieza(char color, int x, int y) {
        this.color = color;
        this.posicion = new Posicion(x, y);
    }

    public char getColor() {
        return color;
    }

    
    public final Posicion getPosicion() {
        return posicion;
    }

    public final void setColor(char color) {
        this.color = color;
    }

    public final void setPosicion(Posicion posicion) {
        this.posicion=posicion;
    }

    public abstract boolean movimientoValido(Pieza[][] NamelessParameter1, Posicion NamelessParameter2);

   
}
