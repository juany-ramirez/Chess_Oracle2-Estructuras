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
    Lista hijos=new Lista();
    
    public NodoArbol() {
        value=null;
    }

    public NodoArbol(Object move) {
        this.value = move;
        
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
      
 
    public NodoArbol getLefterSon(){
        NodoArbol izquierdo= (NodoArbol)hijos.at(0);
        return izquierdo;
    }
    
    public void addSon(Object hijo){
        hijos.push(new NodoArbol(hijo));
    }

    public boolean isLeaf(){
        return hijos.getSize()==0;
    }
    
}
    
   
