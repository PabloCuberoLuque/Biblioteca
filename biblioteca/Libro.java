package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int nEjemplaresTotales;
    private int nEjemplaresPrestados;

    public Libro() {
        
    }

    public Libro(String titulo, String autor, int nEjemplaresTotales, int nEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplaresTotales = nEjemplaresTotales;
        this.nEjemplaresPrestados = nEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public int getnEjemplaresTotales() {
        return nEjemplaresTotales;
    }

    public void setnEjemplaresTotales(int nEjemplaresTotales) {
        this.nEjemplaresTotales = nEjemplaresTotales;
    }

    public int getnEjemplaresPrestados() {
        return nEjemplaresPrestados;
    }

    public void setnEjemplaresPrestados(int nEjemplaresPrestados) {
        this.nEjemplaresPrestados = nEjemplaresPrestados;
    }
    
    public boolean prestamo(){
        boolean resultado;
        if(nEjemplaresTotales>0){
            resultado=true;
            nEjemplaresPrestados++;
            nEjemplaresTotales--;
        }
        else{
            return false;
        }
        return resultado;
    }
    
    public boolean devolucion(){
        boolean resultado;
        if(nEjemplaresPrestados>0){
            resultado=true;
            nEjemplaresPrestados--;
            nEjemplaresTotales++;
        }
        else{
            resultado=false;
        }
        return resultado;
    }
    
    public String toString(){
        return "El titulo del libro es " + titulo + "\n El autor del libro es "+ autor + "\n El numero de ejemplares disponibles en la biblioteca es: "+ nEjemplaresTotales +"\n El numero de ejemplares prestados por la biblioteca es: "+nEjemplaresPrestados;
    }
    
}
