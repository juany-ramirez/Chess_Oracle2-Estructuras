package Clases;



/**
 *
 * @author manuel
 */
public class Nodo {
    Object value;
    Nodo next;
    Nodo previous;

    public Nodo() {
    }
    
    
    public Nodo(Object value){
        this.value = value;
        next = null;
        previous = null;
    }
    
    public Object getValue(){
        return value;
    }
    
    
    public Nodo getPrevious(){
        return previous;
    }
    
    public void setPrevious(Nodo nuevo){
        previous = nuevo;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setNext(Nodo nuevo){
        next = nuevo;
    }
    
    public boolean hasNext(){
        if(next == null){
            return false;
        }else{
            return true;
        }
    }
    
}
