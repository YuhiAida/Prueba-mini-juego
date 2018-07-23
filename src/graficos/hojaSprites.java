
package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class hojaSprites {
    private final int ancho;
    private final int alto;
    public final int[] pixeles;
    //
    
    public static hojaSprites escenario = new hojaSprites("/recursos/1.png", 160, 96);
    
    //
    public hojaSprites(final String ruta, final int ancho, final int alto){
        this.ancho = ancho;
        this.alto = alto;
        
        pixeles = new int[ancho * alto];
        
        BufferedImage imagen;
        try {
            imagen = ImageIO.read(hojaSprites.class.getResource(ruta));
            
            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
        } catch (IOException ex) {
            Logger.getLogger(hojaSprites.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public int obtenAncho(){
        return ancho;
    }
}
