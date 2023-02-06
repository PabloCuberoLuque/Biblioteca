package videoclub;

public class Ejemplar {
    int codigo;
    String nombre;
    double precio;

    public Ejemplar() {
    }
        
    public void registrarPelicula(int codigo,String nombre, double precio){
        this.codigo= codigo;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public void modificarPelicula(int codigo,String nombre, double precio){
        this.codigo= codigo;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public void eliminarPelicula(){
        this.codigo=0;
        this.nombre=null;
        this.precio=0.0;
    }
}
