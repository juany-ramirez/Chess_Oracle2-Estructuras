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
    public void recorrido(NodoArbol nodo){
        for (int i = -1; i < nodo.getHijos().getSize(); i++){ 
            if(nodo.getPadre()!=null){
                System.out.println(nodo.getValue()+" (Padre: "+nodo.getPadre()+")");
            }else{
                System.out.println(nodo.getValue());
            }
            recorrido((NodoArbol)nodo.getHijos().at(i+1));
        }
    }
}
