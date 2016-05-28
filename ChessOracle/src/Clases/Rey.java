package Clases;



public class Rey extends Pieza {

    public Rey(String color, int x, int y) {
        super(color, x, y);
    }

    public boolean movimientoValido(Pieza[][] tablero, Posicion direccion) {
        int diferenciaV;
        int diferenciaH;
        String actual;
        String opuesto;
        if (this.getColor() == "B") {
            actual = "B";
            opuesto = "N";
        } else {
            actual = "N";
            opuesto = "B";
        }

        if (tablero[direccion.getY()][direccion.getX()] == null || tablero[direccion.getY()][direccion.getX()].getColor() == opuesto) {
            if ((direccion.getY() == this.posicion.getY() - 1) && (direccion.getX() == this.posicion.getX() - 1)) {
                return true;
            } else if ((this.posicion.getX() == direccion.getX()) && (direccion.getY() == this.posicion.getY() - 1)) {
                return true;
            } else if ((direccion.getY() == this.posicion.getY() - 1) && (direccion.getX() == this.posicion.getX() + 1)) {
                return true;
            } else if ((this.posicion.getY() == direccion.getY()) && (direccion.getX() == this.posicion.getX() - 1)) {
                return true;
            } else if ((this.posicion.getY() == direccion.getY()) && (direccion.getX() == this.posicion.getX() + 1)) {
                return true;
            } else if ((direccion.getY() == this.posicion.getY() + 1) && (direccion.getX() == this.posicion.getX() - 1)) {
                return true;
            } else if ((direccion.getY() == this.posicion.getY() + 1) && (direccion.getX() == this.posicion.getX())) {
                return true;
            } else if ((direccion.getY() == this.posicion.getY() + 1) && (direccion.getX() == this.posicion.getX() + 1)) {
                return true;
            }
        } else if (tablero[direccion.getY()][direccion.getX()].getColor() == actual) {
            return false;
        }
        return false;
    }


}
