package videoclub;

public class Cliente {
    int codigo;
    String nombre;
    Bono bono;

    public Cliente(){
 }
    
    public void registarCliente(int codigo, String nombre, Bono bono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.bono = bono;
    }
    
    public void modificarCliente(int codigo, String nombre , Bono bono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.bono=bono;
    }

    public void eliminarCliente(){
        this.codigo=0;
        this.nombre=null;
        this.bono=null;
    }
}
