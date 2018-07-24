
package graficos;

public final class Sprite {
    private final int lado;
    
    private int x;
    private int y;
    
    public int[] pixeles;
    private hojaSprites hoja;
    
    //
    public static final Sprite PASTO = new Sprite(32, 0);
    public static final Sprite VACIO = new Sprite(32, 0, 0, hojaSprites.escenario);
    //
    
    public Sprite(final int lado, final int columna, final int fila, final hojaSprites hoja) {
        
        this.lado = lado;
        pixeles = new int[lado * lado];
        this.x = columna * lado;
        this.y = fila * lado;
        this.hoja = hoja;
        
        for (int y = 0; y < lado; y++) {
            for (int x = 0; x < lado; x++) {
                pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.obtenAncho()];
            }
        }
    }
    
    public Sprite(final int lado, final int color){
        this.lado = lado;
        pixeles = new int[lado * lado];
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = color;
        }
        
    }
    
    public int getLado() {
        return lado;
    }
}
