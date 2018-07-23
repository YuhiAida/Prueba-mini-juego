package mapas.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public abstract class Cuadro {
    public int x;
    public int y;
    
    //Sprite statico???
    public static Sprite sprite;
    
    //colleccion de cuadros
    public static final Cuadro PASTO = new CuadroPasto(Sprite.PASTO);
    
    //--------------------
    
    
    public Cuadro(Sprite sprite) {
        this.sprite = sprite;
    }
    
    public void mostrar(int x, int y, Pantalla pantalla){
    
    }
    
    public boolean solido(){
        return false;
    }
    
    
}
