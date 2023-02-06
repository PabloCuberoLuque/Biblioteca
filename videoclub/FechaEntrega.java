package videoclub;

import java.util.Date;

public class FechaEntrega {
    Date fecha;
    Cliente cliente;
    Ejemplar ejemplar;

    public FechaEntrega(Date fecha, Cliente cliente, Ejemplar ejemplar) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.ejemplar = ejemplar;
    }
    
    
}
