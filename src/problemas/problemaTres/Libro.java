package problemas.problemaTres;

public class Libro extends Productos{

    //Atributos:
    String isbn;

    //Constructor:
    public Libro(String nombre, double precio, String isbn) {
        super(nombre, precio);
        this.isbn = isbn;
    }

    //Metodos:

    @Override
    public void rebajarPrecio(double porcentaje) {
        super.rebajarPrecio(porcentaje);
    }

    //Getters y setters:
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //Metodo toString:
    @Override
    public String toString() {
        return super.toString() + "\nel isbn es " + this.isbn;
    }
}
