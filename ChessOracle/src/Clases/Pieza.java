package Clases;

public abstract class Pieza {
    
    protected String tipo;
    protected char color;
    protected Posicion posicion;
    protected Posicion anterior;

    public Pieza() {
    }
    
    public Pieza(char color, int x, int y, String tipo) {
        this.color = color;
        this.posicion = new Posicion(x, y);
        this.tipo=tipo;
    }

    public Posicion getAnterior() {
        return anterior;
    }

    public void setAnterior(int x, int y) {
        this.anterior = new Posicion(x, y);
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public abstract boolean movimientoValido(Pieza[][] NamelessParameter1, Posicion NamelessParameter2);

    public abstract String toString();
   
}
