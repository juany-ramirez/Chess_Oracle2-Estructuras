package Clases;



public class Peon extends Pieza{ 

    private boolean firstMove;

    public Peon() {
    }
    
    public Peon(String color, int x, int y) { //constructor
        super(color, x, y);
        firstMove = true;
    }

    public final int diferenciasX(Posicion direccion) {
        int difer = Math.abs(posicion.getX() - direccion.getX());
        return difer;
    }

    public final int diferenciasY(Posicion direccion) {
        int difer = Math.abs(posicion.getY() - direccion.getY());
        return difer;
    }

    public boolean movimientoValido(Tablero tablero, Posicion direccion) {
        int diferY = diferenciasY(new Posicion(direccion));
        int diferX = diferenciasX(new Posicion(direccion));
        String actual = this.getColor();

        if ((diferX == 0 && diferY == 1) || (diferY == 2 && firstMove && diferX == 0)) { //primer movimiento o movimiento hacia adelante
            if (tablero.get(direccion.getY(),direccion.getX()) == null || tablero.get(direccion.getY(),direccion.getX()).getColor() != actual) {
                return true;
            }
            return false;
        } else if ((diferY == 1 && diferX == 1)) {
            if (tablero.get(direccion.getY(),direccion.getX()).getColor() != actual) //comer en diagonal
            {
                return true;
            }
            return false;
        } else {
            return false;
        }

    }

}
