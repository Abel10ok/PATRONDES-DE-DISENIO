package composicion;

public class Producto implements Comprable{
    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double calcularPrecio() {
        System.out.println("Soy una "+nombre+" y mi precio es "+precio);
        return precio;
    }
}
