package problemas.problemaTres;

public class Alimento extends Productos{

    //Atributos:
    String productor;
    String distribuidor;

    //Constructor:

    public Alimento(String nombre, double precio, String productor, String distribuidor) {
        super(nombre, precio);
        this.productor = productor;
        this.distribuidor = distribuidor;
    }


    //Metodos:

    @Override
    public void rebajarPrecio(double porcentaje) {
        super.rebajarPrecio(porcentaje);
    }

    //Getters y Setters:
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

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    //toString:
    @Override
    public String toString() {
        return super.toString() + "\nel productor es " +
                this.productor + " y el distribuidor es " +this.distribuidor;
    }
}
