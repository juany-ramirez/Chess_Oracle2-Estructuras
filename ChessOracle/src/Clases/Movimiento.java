/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Inspiron
 */
public class Movimiento{
    String tipo;
    Posicion posicion;
    
    public Movimiento(String tipo, Posicion posicion) {
        this.tipo = tipo;
        this.posicion = posicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return tipo+"("+posicion.getX()+","+posicion.getY()+")";
    }
    
}
