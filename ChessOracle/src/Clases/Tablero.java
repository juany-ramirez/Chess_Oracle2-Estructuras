
package Clases;

/**
 *
 * @author Admin
 */
public class Tablero {
    Lista lista;
    int fil;
    int col;
    
    public Tablero(){
        
    }

    public Tablero(int fil, int col) {
        this.col = col;
        this.fil = fil;
        lista = new Lista();
        for (int i = 0; i < col; i++) {
            lista.push(new Lista());
            for (int j = 0; j < fil; j++) {
                ((Lista)lista.at(i)).push(null);
            }
        }
    }
    
    public void add (int x, int y, Pieza value){
        ((Lista)lista.at(x)).insert(value, y);
    }
    
    public Pieza get (int x, int y){
        return (Pieza)((Lista)lista.at(x)).at(y);
        
    }
    public void print (){
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                
            }
        }
    }
          
}
