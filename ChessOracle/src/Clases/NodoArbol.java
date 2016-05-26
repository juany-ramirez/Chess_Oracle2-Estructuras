/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Admin
 */
public class NodoArbol {
    
    Object value;
    Lista hijos;
    
    public NodoArbol() {
        hijos = new Lista();
    }

    public NodoArbol(Object padre) {
        this.value = padre;
    } 
    
    public NodoArbol(Object padre, Lista hijos) {
        this.value = padre;
        this.hijos = hijos;
    }
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object padre) {
        this.value = padre;
    }

    public Lista getHijos() {
        return hijos;
    }

    public void setHijos(Lista hijos) {
        this.hijos = hijos;
    }
    
    public void addSon(Object value){
        if (hijos == null)
            hijos = new Lista();
        hijos.push(new NodoArbol(value));
    }
    
    public void deleteSon(Object value){
        hijos.remove(hijos.find(value));
    }
    
    public int sizeH(){
        return hijos.size;
    }
    
    public boolean tieneHijos(){
        if(hijos == null || hijos.size == 0)
            return true;
        return false;
    }
}
