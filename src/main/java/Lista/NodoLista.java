/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Carla Nuñez
 */
public class NodoLista {
    Object elemento;
    NodoLista enlace;

 public NodoLista(Object elemento){
      this.elemento=elemento;
      this.enlace=null;
    }
public NodoLista (){
    this.elemento=null;
}
public NodoLista(Object elemento, NodoLista enlace) {
    this.elemento = elemento;
    this.enlace = enlace;
}

    
public Object getElem(){
    return elemento;
}
public void setElemento (Object elemento){
     this.elemento = elemento;
}
public NodoLista getEnlace (){
    return enlace;   
}
public void setEnlace(NodoLista enlace) {
    this.enlace = enlace;
}

    void setEnlace(int promedio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

