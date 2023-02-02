package biblioteca;

public class TestLibro {
    public static void main(String[] args) {
        Libro l1= new Libro("Quijote", "Cervantes", 12, 0); 
        l1.toString();
        System.out.println(l1.prestamo());
        System.out.println(l1.toString());
        System.out.println(l1.devolucion());
        System.out.println(l1.toString());
    }
    
}
