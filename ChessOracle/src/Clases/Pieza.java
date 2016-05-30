package Clases;

public abstract class Pieza {

    protected String color;
    protected Posicion posicion = new Posicion();


    public Pieza() {
    
    }
    
    public Pieza(String color, int x, int y) {
        this.color = color;
        this.posicion = new Posicion(x, y);
    }

    public String getColor() {
        return color;
    }
    
    public final Posicion getPosicion() {
        return posicion;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final void setPosicion(Posicion posicion) {
        this.posicion=posicion;
    }

    public boolean movimientoValido(Pieza[][] tablero, Posicion posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   
}
