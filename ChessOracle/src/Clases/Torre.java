package Clases;

public class Torre extends Pieza {

    public Torre(char color, int x, int y, String tipo) {
        super(color, x, y, tipo);
    }

    public boolean movimientoValido(Pieza[][] tablero, Posicion direccion) {
        if (((posicion.getX() == direccion.getX()) && (posicion.getY() != direccion.getY()))) { //si se mueve verticalmente
            if (posicion.getY() < direccion.getY()) { //si se mueve hacia abajo
                for (int fila = posicion.getY() + 1; fila < direccion.getY(); ++fila) {
                    if (tablero[fila][posicion.getX()] != null) { //si se encuentra una pieza entre origin y direccion
                        return false;
                    }
                }
                if (tablero[direccion.getY()][posicion.getX()] == null || tablero[direccion.getY()][posicion.getX()].getColor() != color) {
                    //si direccion est vacio o tiene una pieza enemiga
                    return true;
                } else {
                    return false;
                }
            } else if (posicion.getY() > direccion.getY()) { //si se mueve hacia arriba
                for (int fila = posicion.getY() - 1; fila > direccion.getY(); --fila) {
                    if (tablero[fila][posicion.getX()] != null) {
                        return false;
                    }
                }
                if (tablero[direccion.getY()][posicion.getX()] == null || tablero[direccion.getY()][posicion.getX()].getColor() != color) {
                    //SI direccion ESTA VACIO O TIENE UNA PIEZA ENEMIGA
                    return true;
                } else {
                    return false;
                }
            }

        } else if (((posicion.getX() != direccion.getX()) && (posicion.getY() == direccion.getY()))) { //si se mueve horizontalmente
            if (posicion.getX() < direccion.getX()) { //si se mueve hacia la derecha
                for (int columna = posicion.getX() + 1; columna < direccion.getX(); ++columna) {
                    if (tablero[posicion.getY()][columna] != null) { //si se encuentra una pieza entre origin y direccion
                        return false;
                    }
                }
                if (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color) {
                    //si direccion est vacio o tiene una pieza enemiga
                    return true;
                } else {
                    return false;
                }
            } else if (posicion.getX() > direccion.getX()) { //si se mueve hacia la izquierda
                for (int columna = posicion.getX() - 1; columna > direccion.getX(); --columna) {
                    if (tablero[posicion.getY()][columna] != null) { //si se encuentra una pieza entre origin y direccion
                        return false;
                    }
                }
                if (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() != color) {
                    //si direccion est vacio o tiene una pieza enemiga
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public String toString() {
        String ss;
        if (color == 'N') {
            ss = "T";
        } else {
            ss = "t";
        }
        return ss;
    }
}
