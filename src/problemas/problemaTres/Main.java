package problemas.problemaTres;

public class Main {


    /*
3.

a) Defina una clase llamada Productos, la cual posee los siguientes atributos: nombre
(String) y precio (double), también posee el método rebajarPrecio, el cual reciba un
parámetro llamado porcentaje (double) y modifica el atributo precio disminuyendo su
valor en función del porcentaje. Defina un constructor que reciba como parámetro todos
los atributos de la clase Producto. Adicional, sobreescriba el método toString para
que muestra el siguiente mensaje por consola "Este producto es un this.nombre y su
precio es: this.precio". (nota: la palabra reservada “this” es para hacer referencia
a los atributos o variables de instancia del objeto)

b) Defina la clase Adorno la cual hereda todos los atributos y métodos de Producto.
Sobreescriba el método rebajarPrecio para la clase Adorno, de manera que no rebaje el
precio.

c) Defina la clase Libro la cual hereda todos los atributos y métodos de Producto y
adicional tiene el atributo isbn (String).

d) Defina la clase Alimento la cual hereda todos los atributos y métodos de Producto y
adicional tiene los atributos productor y distribuidor, ambos del tipo String.

*/


    public static void main(String[] args) {
        /*
        double porcentaje = 20;
        double precio = 10;
        double descuento = 0;
        descuento = precio * (porcentaje*0.01);
        precio = precio - descuento;

        System.out.println(precio);

         */

        Productos p1 = new Productos("manzana",10);
        p1.rebajarPrecio(30);
        System.out.println(p1.toString());

        Productos p2 = new Adorno("girnalda",200);
        p2.rebajarPrecio(30);
        System.out.println(p2.toString());

        Productos p3 = new Libro("Harry Potter",150,"1234bh123");
        p3.rebajarPrecio(15);
        System.out.println(p3.toString());

        Productos p4 = new Alimento("durazno",20,"Mendoza","Molto");
        p4.rebajarPrecio(10);
        System.out.println(p4.toString());


    }
}
