package Clases;



public class Alfil extends Pieza {

    
    
    public Alfil(String color, int X, int Y) {
        super(color, X, Y);
    }

    
    public boolean movimientoValido(Tablero tablero, Posicion direccion) {
        int y;
        int x;
        String actual = this.getColor();

        if ((this.posicion.getX() == direccion.getX()) || (this.posicion.getY() == direccion.getY())) {
            //verifica que no se mueva a los lados ni verticalmente
            return false;
        }

        if (Math.abs(this.posicion.getY() - direccion.getY()) == Math.abs(this.posicion.getX() - direccion.getX())) { //verifica si se mueve en diagonal
            if (this.posicion.getY() > direccion.getY() && this.posicion.getX() > direccion.getX()) {
                y = this.posicion.getY() - 1;
                x = this.posicion.getX() - 1;

                while (true) {
                    if (tablero.get(x, y) == null) {
                        y--;
                        x--;

                    } else if (tablero.get(x, y) != null && tablero.get(x, y).getColor() == actual) {
                        return false;
                    }
                    if (x == direccion.getX() || y == direccion.getY()) {
                        break;
                    }
                }
                return true;

            } else if (this.posicion.getY() > direccion.getY() && this.posicion.getX() < direccion.getX()) {
                y = this.posicion.getY() - 1;
                x = this.posicion.getX() + 1;

                while (true) {
                    if (tablero.get(x, y) == null) {
                        y--;
                        x++;
                    } else if (tablero.get(x, y) != null && tablero.get(x, y).getColor() == actual) {
                        return false;
                    }
                    if (x == direccion.getX() || y == direccion.getY()) {
                        break;
                    }
                }

                return true;

            } else if (this.posicion.getY() < direccion.getY() && this.posicion.getX() > direccion.getX()) {
                y = this.posicion.getY() + 1;
                x = this.posicion.getX() - 1;

                while (true) {
                    if (tablero.get(x, y) == null) {
                        y++;
                        x--;
                    } else if (tablero.get(x, y) != null && tablero.get(x, y).getColor() == actual) {
                        return false;
                    }
                    if (x == direccion.getX() || y == direccion.getY()) {
                        break;
                    }
                }

                return true;

            } else if (this.posicion.getY() < direccion.getY() && this.posicion.getX() < direccion.getX()) {
                y = this.posicion.getY() + 1;
                x = this.posicion.getX() + 1;

                while (true) {
                    if (tablero.get(x, y) == null) {
                        y++;
                        x++;
                    } else if (tablero.get(x, y) != null && tablero.get(x, y).getColor() == actual) {
                        return false;
                    }
                    if (x == direccion.getX() || y == direccion.getY()) {
                        break;
                    }
                }

                return true;
            }

        } else {
            return false;
        }
        return false;
    }


}
