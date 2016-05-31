package Clases;

public class Caballo extends Pieza {

    public Caballo() {

    }

    public Caballo(char color, int x, int y, String tipo) {
        super(color, x, y, tipo);
    } //constructor

    public boolean movimientoValido(Pieza[][] tablero, Posicion direccion) {
        if (posicion.getX() + 2 == direccion.getX() && posicion.getY() + 1 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x+2, y+1
        {
            return true;
        } else if (posicion.getX() + 2 == direccion.getX() && posicion.getY() - 1 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x+2, y-1
        {
            return true;
        } else if (posicion.getX() - 2 == direccion.getX() && posicion.getY() + 1 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x-2, y+1
        {
            return true;
        } else if (posicion.getX() - 2 == direccion.getX() && posicion.getY() - 1 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x-2, y-1
        {
            return true;
        } else if (posicion.getX() + 1 == direccion.getX() && posicion.getY() + 2 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x+1 y+2
        {
            return true;
        } else if (posicion.getX() - 1 == direccion.getX() && posicion.getY() + 2 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x-1, y+2
        {
            return true;
        } else if (posicion.getX() + 1 == direccion.getX() && posicion.getY() - 2 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x+1 y-2
        {
            return true;
        } else if (posicion.getX() - 1 == direccion.getX() && posicion.getY() - 2 == direccion.getY() && (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color)) //x-1, y-2
        {
            return true;
        } else {
            return false;
        }
    } //si el moviemiento es valido
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual String toString()const

    @Override
    public String toString() {
        String ss;
        if (color == 'N') {
            ss = "C";
        } else {
            ss = "c";
        }
        return ss;
    }

}
