package mapas;

import graficos.Pantalla;

public abstract class mapa {
    private int ancho;
    private int alto;
    
    private int[] cuadros;

    public mapa(int ancho, int alto, int[] cuadros) {
        this.ancho = ancho;
        this.alto = alto;
        this.cuadros = cuadros;
        
        cuadros = new int[ancho * alto];
        generarMapa();
        
    }
    
    public mapa(String ruta){
        cargarMapa(ruta);
    }
    private void generarMapa(){
    
    }
    
    private void cargarMapa(String ruta){
        
    }
    
    public void actualizar(){
    
    }
    
    public void mostrar(int compensacionX, int compensacionY, Pantalla pantalla){
    
    }
    
}