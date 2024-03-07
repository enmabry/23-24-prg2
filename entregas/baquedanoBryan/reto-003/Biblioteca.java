class Usuario {
    
    public Usuario(String Nombre, int DNI);
    public Usuario(int DNI);

    public String obtenerNombre();
    public int obtenerDNI();
}

class Libro {

    public Libro(String obtenerTítulo, String Autor);
    public Libro(String obtenerTítulo);
    
    public String obtenerTítulo();
    public String obtenerAutor();
    public boolean disponibilidad();
    
}