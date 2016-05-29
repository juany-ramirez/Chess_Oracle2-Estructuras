package Clases;

public class Reina extends Pieza
{
    public Reina(){
	}
    
	public Reina(String color, int x, int y)
	{
		super(color, x, y);
	}
	public final Alfil alfilValido()
	{ //laa reina tiene los movimientos del alfil
		Alfil alfil = new Alfil(this.color, this.posicion.getX(), this.posicion.getY());
		return alfil;
	}
	public final Torre torreValido()
	{ //la reina tiene los movimientos de la torre
		Torre torre = new Torre(this.color, this.posicion.getX(), this.posicion.getY());
		return torre;
	}
        
	public boolean movimientoValido(Tablero tablero, Posicion direccion)
	{
		Alfil a = alfilValido();
		Torre t = torreValido();

		if (t.movimientoValido(tablero, new Posicion(direccion)) || a.movimientoValido(tablero, new Posicion(direccion)))
		{
			return true;
		}
		else
		              {
			return false;
		}
	}
        

}