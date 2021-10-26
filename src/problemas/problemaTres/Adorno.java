package problemas.problemaTres;

public class Adorno extends Productos {

    //constructor:
    public Adorno(String nombre, double precio) {
        super(nombre, precio);
    }


    //metodos:

    @Override
    public void rebajarPrecio(double porcentaje) {

    }

    //getters y setters:
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


    //metodo toString
    @Override
    public String toString() {
        return super.toString();
    }
}
