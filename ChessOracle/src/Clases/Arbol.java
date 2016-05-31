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
    
    public void delete(){
        root.getHijos().remove(root.getHijos().find(this));
    }
    
    
    
}
