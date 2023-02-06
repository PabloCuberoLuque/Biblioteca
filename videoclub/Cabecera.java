package videoclub;

public class Cabecera {
    FechaEntrega fecha;
    
    public void insertarCabecera(FechaEntrega fecha){
        this.fecha=fecha;
    }
    
    public void eliminarCabecera(){
        this.fecha=null;
    }
}
