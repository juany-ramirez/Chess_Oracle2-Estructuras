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
    Movimiento value;
    NodoArbol padre;
    Lista hijos=new Lista();
    int nivel=0;
    
    public NodoArbol() {
        value=null;
    }

    public NodoArbol(Movimiento move, NodoArbol padre) {
        this.value = move;
        this.padre=padre;   
    } 
        
    public Movimiento getValue() {
        return value;
    }

    public void setValue(Movimiento move) {
        this.value = move;
    }

    public NodoArbol getPadre() {
        return padre;
    }

    public int getNivel() {
        if(padre==null){
            return 0;
        }
        return padre.getNivel()+1;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPadre(NodoArbol padre) {
        this.padre = padre;
    }

    public Lista getHijos() {
        return hijos;
    }

    public void setHijos(Lista hijos) {
        this.hijos = hijos;
    }
      
    public NodoArbol getRightBrother(){
        NodoArbol derecho = null;
        derecho=(NodoArbol)padre.getHijos().at(padre.getHijos().find(this));
        return derecho;
    }
 
    public NodoArbol getLefterSon(){
        NodoArbol izquierdo= (NodoArbol)hijos.at(0);
        return izquierdo;
    }
    
    public void addSon(Movimiento move){
        hijos.insert(new NodoArbol(move,this),hijos.getSize());
        nivel++;
    }
    
    public void delete(){
        padre.getHijos().remove(padre.getHijos().find(this));
    }
    
    public boolean isLeaf(){
        return hijos.getSize()==0;
    }
}
    
   
