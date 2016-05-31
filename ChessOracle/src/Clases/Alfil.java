package Clases;



public class Alfil extends Pieza {

    public Alfil(char color, int X, int Y, String tipo) {
        super(color, X, Y, tipo);
    }

    
    public boolean movimientoValido(Pieza[][] tablero, Posicion direccion) {
        int y;
        int x;
        char actual = this.getColor();

        if ((this.posicion.getX() == direccion.getX()) || (this.posicion.getY() == direccion.getY())) {
            //verifica que no se mueva a los lados ni verticalmente
            return false;
        }

        if (Math.abs(this.posicion.getY() - direccion.getY()) == Math.abs(this.posicion.getX() - direccion.getX())) { //verifica si se mueve en diagonal
            if (this.posicion.getY() > direccion.getY() && this.posicion.getX() > direccion.getX()) {
                y = this.posicion.getY() - 1;
                x = this.posicion.getX() - 1;

                while (true) {
                    if (tablero[y][x] == null) {
                        y--;
                        x--;

                    } else if (tablero[y][x] != null && tablero[y][x].getColor() == actual) {
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
                    if (tablero[y][x] == null) {
                        y--;
                        x++;
                    } else if (tablero[y][x] != null && tablero[y][x].getColor() == actual) {
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
                    if (tablero[y][x] == null) {
                        y++;
                        x--;
                    } else if (tablero[y][x] != null && tablero[y][x].getColor() == actual) {
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
                    if (tablero[y][x] == null) {
                        y++;
                        x++;
                    } else if (tablero[y][x] != null && tablero[y][x].getColor() == actual) {
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

    @Override
    public String toString() {
        String ss;
        if (color == 'N') {
            ss = "A";
        } else {
            ss = "a";
        }
        return ss;
    }

}
