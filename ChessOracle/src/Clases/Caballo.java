package Clases;


public class Caballo extends Pieza {

    public Caballo() {
    }
    
    public Caballo(String color, int x, int y) {
        super(color, x, y);
    } //constructor

    public boolean movimientoValido(Tablero tablero, Posicion direccion) {
        if (posicion.getX() + 2 == direccion.getX() && posicion.getY() + 1 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x+2, y+1
        {
            return true;
        } else if (posicion.getX() + 2 == direccion.getX() && posicion.getY() - 1 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x+2, y-1
        {
            return true;
        } else if (posicion.getX() - 2 == direccion.getX() && posicion.getY() + 1 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x-2, y+1
        {
            return true;
        } else if (posicion.getX() - 2 == direccion.getX() && posicion.getY() - 1 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x-2, y-1
        {
            return true;
        } else if (posicion.getX() + 1 == direccion.getX() && posicion.getY() + 2 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x+1 y+2
        {
            return true;
        } else if (posicion.getX() - 1 == direccion.getX() && posicion.getY() + 2 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x-1, y+2
        {
            return true;
        } else if (posicion.getX() + 1 == direccion.getX() && posicion.getY() - 2 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x+1 y-2
        {
            return true;
        } else if (posicion.getX() - 1 == direccion.getX() && posicion.getY() - 2 == direccion.getY() && (tablero.get(direccion.getY(),direccion.getX()) == null || !tablero.get(direccion.getY(),direccion.getX()).getColor().equals(color))) //x-1, y-2
        {
            return true;
        } else {
            return false;
        }
    } //si el moviemiento es valido

   

    



}
