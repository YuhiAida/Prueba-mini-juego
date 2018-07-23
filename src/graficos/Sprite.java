
package graficos;

public final class Sprite {
    private final int lado;
    
    private int x;
    private int y;
    
    public int[] pixeles;
    private final hojaSprites hoja;
    
    //
    public static Sprite kirito = new Sprite(32, 0, 0, hojaSprites.personaje);
    //
    public Sprite(final int lado, final int columna, final int fila, final hojaSprites hoja) {
		this.lado = lado;
        
        pixeles = new int[lado * lado];

		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.obtenAncho()];
            }
        }
    }
}
