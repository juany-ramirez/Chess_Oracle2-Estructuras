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
    NodoArbol padre;
    Lista hijos = new Lista();
    
    public NodoArbol() {
        value=null;
    }

    
    public NodoArbol(Object value, NodoArbol padre) {
        this.value = value;
        this.padre = padre;
    }

    public NodoArbol getPadre() {
        return padre;
    }

    public void setPadre(NodoArbol padre) {
        this.padre = padre;
    }

    
    public Object getValue() {
        return value;
    }

    public void setValue(Object move) {
        this.value = move;
    }

    public Lista getHijos() {
        return hijos;
    }

    public void setHijos(Lista hijos) {
        this.hijos = hijos;
    }
      
    public int getChildCount(){
        return hijos.getSize();
    }
    
    public NodoArbol getLefterSon(){
        NodoArbol izquierdo= (NodoArbol)hijos.at(0);
        return izquierdo;
    }
    
    public NodoArbol getRightBrother(){
        NodoArbol derecho=null;
        int pos=padre.getHijos().find(this);
        if(padre.getHijos().getSize()>pos){
            derecho=(NodoArbol)padre.getHijos().at(pos+1);
        }
        return derecho;
    }
    
    public void addSon(Object hijo, NodoArbol padre){
        hijos.push(new NodoArbol(hijo, padre));
    }

    public boolean isLeaf(){
        return hijos.getSize()==0;
    }
    
}
    
   
