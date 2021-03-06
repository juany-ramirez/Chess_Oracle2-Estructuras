package Clases;

public class Peon extends Pieza {


    public Peon() {

    }

    public Peon(char color, int x, int y, String tipo) { //constructor
        super(color, x, y,tipo);
    }

    public final int diferenciasX(Posicion direccion) {
        int difer = Math.abs(posicion.getX() - direccion.getX());
        return difer;
    }

    public final int diferenciasY(Posicion direccion) {
        int difer = Math.abs(posicion.getY() - direccion.getY());
        return difer;
    }

    public boolean movimientoValido(Pieza[][] tablero, Posicion direccion) {
        int diferY = diferenciasY(new Posicion(direccion));
        int diferX = diferenciasX(new Posicion(direccion));
        char actual = this.getColor();

        if ((diferX == 0 && diferY == 1)) { //primer movimiento o movimiento hacia adelante
            if (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != actual) {
                return true;
            }
            return false;
        } else if ((diferY == 1 && diferX == 1)) {
            if (tablero[direccion.getY()][direccion.getX()].getColor() != actual) //comer en diagonal
            {
                return true;
            }
            return false;
        } else {
            return false;
        }

    }

    public String toString() {
        String ss;
        if (color == 'N') {
            ss = "P";
        } else {
            ss = "p";
        }
        return ss;
    }
}
