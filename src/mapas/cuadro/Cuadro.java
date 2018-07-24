package mapas.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public abstract class Cuadro {
    public int x;
    public int y;
    
    public static final int LADO = 32;
    //Sprite statico???
    public Sprite sprite;
    
    //colleccion de cuadros
    
    public static final Cuadro VACIO = new CuadroVacio(Sprite.VACIO);
    public static final Cuadro PASTO = new CuadroPasto(Sprite.PASTO);
    
    //--------------------
    
    
    public Cuadro(Sprite sprite) {
        this.sprite = sprite;
    }
    
    public void mostrar(int x, int y, Pantalla pantalla){
        pantalla.mostrarCuadro(x << 5, y <<5, this);
    }
    
    public boolean solido(){
        return false;
    }
    
    
}
