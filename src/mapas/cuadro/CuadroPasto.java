package mapas.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class CuadroPasto extends Cuadro{
    
    public CuadroPasto(Sprite sprite) {
        super(sprite);
    }
    
    public void mostrar(int x, int y, Pantalla pantalla){
        pantalla.mostrarCuadro(x, y, this);
    }
    
    
}
