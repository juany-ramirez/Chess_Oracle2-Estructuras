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
public class Arbol {
    NodoArbol root=null;

    public Arbol(NodoArbol root) {
        this.root = root;
    }

    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
    }
        
    public boolean isEmpty(){
        return(root==null);
    }
    
    public void llamarRecorrido(){
        recorrido(root);
    }
    
    
    public void delete(){
        root.getHijos().remove(root.getHijos().find(this));
    }
    
    public void recorrido(NodoArbol nodo){
        for (int i = -1; i < nodo.getHijos().getSize(); i++){ 
            if(root!=null){
                System.out.println(nodo.getValue()+" (Padre: "+root+")");
            }else{
                System.out.println(nodo.getValue());
            }
            recorrido((NodoArbol)nodo.getHijos().at(i+1));
        }
    }
    
    public void peonCoronado(Pieza[][] tablero){
        Lista peones = new Lista();
        Arbol arbol = new Arbol(new NodoArbol(tablero));
        
    }
}
