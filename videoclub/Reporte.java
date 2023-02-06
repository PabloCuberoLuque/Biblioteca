package videoclub;

public class Reporte {
    String reporte;

    public Reporte() {
    }

    public void RealizarReporte(String reporte) {
        this.reporte=reporte;
    }
    
    public String imprimirReporte(){
        return reporte;
    }
    
}
