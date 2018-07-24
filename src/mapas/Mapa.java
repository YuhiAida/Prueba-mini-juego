package mapas;

import graficos.Pantalla;
import mapas.cuadro.Cuadro;

public abstract class Mapa {
    protected int ancho;
    protected int alto;
    
    protected int[] cuadros;

    public Mapa(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        
        cuadros = new int[ancho * alto];
        generarMapa();
        
    }
    
    public Mapa(String ruta){
        cargarMapa(ruta);
    }
    protected void generarMapa(){
        
    }
    
    private void cargarMapa(String ruta){
        
    }
    
    public void actualizar(){
    
    }
    
    public void mostrar(int compensacionX, int compensacionY, Pantalla pantalla){
        int oeste = compensacionX >> 5;
        int este = (compensacionX + pantalla.getAncho() + Cuadro.LADO) >> 5;
        int norte = compensacionY >> 5;
        int sur = (compensacionY + pantalla.getAlto() + Cuadro.LADO) >>5;
        
        for (int y = norte; y < sur; y++) {
            for (int x = oeste; x < este; x++) {
                obtenCuadro(x, y).mostrar(x, y, pantalla);
            }
        }
    }
    
    public Cuadro obtenCuadro(final int x, final int y){
        if (x < 0 || y < 0 || x >= ancho || y >= alto) {
            return Cuadro.VACIO;
        }
        switch(cuadros[x + y * ancho]){
            case 0:
                return Cuadro.PASTO;
            case 1:
            case 2:
            case 3:
            default:
                return Cuadro.VACIO;
        }    
    }
}