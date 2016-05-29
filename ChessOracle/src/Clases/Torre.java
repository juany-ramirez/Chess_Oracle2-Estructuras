package Clases;

public class Torre extends Pieza {

    public Torre(String color, int x, int y) {
        super(color, x, y);
    }

    public boolean movimientoValido(Tablero tablero, Posicion direccion) {
        if (((posicion.getX() == direccion.getX()) && (posicion.getY() != direccion.getY()))) { //si se mueve verticalmente
            if (posicion.getY() < direccion.getY()) { //si se mueve hacia abajo
                for (int fila = posicion.getY() + 1; fila < direccion.getY(); ++fila) {
                    if (tablero.get(fila, posicion.getX()) != null) { //si se encuentra una pieza entre origin y direccion
                        return false;
                    }
                }
                if (tablero.get(direccion.getY(), posicion.getX()) == null || !tablero.get(direccion.getY(), posicion.getX()).getColor().equals(color)) {
                    //si direccion est vacio o tiene una pieza enemiga
                    return true;
                } else {
                    return false;
                }
            } else if (posicion.getY() > direccion.getY()) { //si se mueve hacia arriba
                for (int fila = posicion.getY() - 1; fila > direccion.getY(); --fila) {
                    if (tablero.get(fila, posicion.getX()) != null) {
                        return false;
                    }
                }
                if (tablero.get(direccion.getY(), posicion.getX()) == null || !tablero.get(direccion.getY(), posicion.getX()).getColor().equals(color)) {
                    //SI direccion ESTA VACIO O TIENE UNA PIEZA ENEMIGA
                    return true;
                } else {
                    return false;
                }
            }

        } else if (((posicion.getX() != direccion.getX()) && (posicion.getY() == direccion.getY()))) { //si se mueve horizontalmente
            if (posicion.getX() < direccion.getX()) { //si se mueve hacia la derecha
                for (int columna = posicion.getX() + 1; columna < direccion.getX(); ++columna) {
                    if (tablero.get(posicion.getY(),columna) != null) { //si se encuentra una pieza entre origin y direccion
                        return false;
                    }
                }
                if (tablero.get(direccion.getY(), posicion.getX()) == null || !tablero.get(direccion.getY(), posicion.getX()).getColor().equals(color)) {
                    //si direccion est vacio o tiene una pieza enemiga
                    return true;
                } else {
                    return false;
                }
            } else if (posicion.getX() > direccion.getX()) { //si se mueve hacia la izquierda
                for (int columna = posicion.getX() - 1; columna > direccion.getX(); --columna) {
                    if (tablero.get(posicion.getY(),columna) != null) { //si se encuentra una pieza entre origin y direccion
                        return false;
                    }
                }
                if (tablero.get(direccion.getY(), posicion.getX()) == null || !tablero.get(direccion.getY(), posicion.getX()).getColor().equals(color)) {
                    //si direccion est vacio o tiene una pieza enemiga
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
