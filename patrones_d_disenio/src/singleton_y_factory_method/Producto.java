package singleton_y_factory_method;

public abstract class Producto{
    private Double peso;

    public Producto(Double peso) {
        this.peso = peso;
    }
    public abstract Double calcularEspacio();
}
