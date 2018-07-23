
package graficos;

import mapas.cuadro.Cuadro;

public class Pantalla {
    private final int ancho;
    private final int alto;
    
    public final int[] pixeles;
    //temporal
    private final static int LADO_SPRITE = 32;
    private final static int MASCARA_SPRITE = LADO_SPRITE - 1;
    //
    
    
    
    //
    public static hojaSprites escenario = new hojaSprites("/recursos/1.png", 160, 96);
    //
    public Pantalla(final int ancho, final int alto) {
        this.ancho = ancho;
        this.alto = alto;
        
        pixeles = new int[ancho*alto];
    }
    
    public void limpiar(){
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = 0;
        }
    }
    //temporal 
    public void mostrar(final int compensacionX, final int compensacionY){
        
        for (int y = 0; y < alto; y++) {
            int posicionY = y + compensacionY;
            if (posicionY < 0 || posicionY >= alto) {
                continue;
            }
            for (int x = 0; x < ancho; x++) {
                int posicionX = x + compensacionX;
                if (posicionX <0 || posicionX >= ancho) {
                    continue;
                }
            //temporal
            pixeles[posicionX + posicionY * ancho] = Sprite.PASTO.pixeles[(x & MASCARA_SPRITE) + (y & MASCARA_SPRITE) * LADO_SPRITE];

            }
        }
    }
    //---------------
    
    public void mostrarCuadro(int compensacionX, int compensacionY, Cuadro cuadro){
        for (int y = 0; y < Cuadro.sprite.getLado(); y++) {
            int posicionY = y + compensacionY;
            for (int x = 0; x < Cuadro.sprite.getLado(); x++) {
                int posicionX = x + compensacionX;
                if (posicionX < 0 || posicionX > ancho || posicionY < 0 || posicionY > alto) {
                    break;
                }
                pixeles[posicionX + posicionY * ancho] = Cuadro.sprite.pixeles[x + y * Cuadro.sprite.getLado()];
            }
        }
    }
}
