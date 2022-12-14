package state_04;

public class Prueba {


    public static void main(String[] args) throws EstadoErroneoException {


        Carrito carrito = new Carrito(); // -> empieza en estado vacio
        Producto mesa = new Producto("Mesa", 200);
        Producto tele = new Producto("Tele", 500);
        Producto silla = new Producto("Silla", 50);

        carrito.avanzar();

        carrito.agregar(mesa);
        carrito.agregar(tele);
        carrito.agregar(silla);

        carrito.mostrarProductos();

        carrito.avanzar();

    }
}
