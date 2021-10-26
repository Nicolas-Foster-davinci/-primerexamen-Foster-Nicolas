package problemas.problemaTres;

public class Productos {

    //Atributos:
    String nombre;
    double precio;

    //contructor:


    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos:
    public void rebajarPrecio(double porcentaje){
        double descuento;
        descuento = precio * (porcentaje*0.01);
        precio = precio - descuento;
    }

    //Metodos getters y setters:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo toString:
    @Override
    public String toString() {
        return "Este producto es " + this.nombre + " y su precio es: $" + this.precio;
    }
}
