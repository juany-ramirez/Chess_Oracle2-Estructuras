package Clases;



/**
 *
 * @author manuel
 */
public class Nodo {
    Object value=null;
    Nodo next=null;
    Nodo previous=null;

    public Nodo() {
    }
    
    public Nodo(Object value){
        this.value = value;
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
