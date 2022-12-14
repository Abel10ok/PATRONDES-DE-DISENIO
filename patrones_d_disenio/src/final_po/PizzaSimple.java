package final_po;

public class PizzaSimple extends Pizza{

    private double precioBase;
    private boolean especial;

    public PizzaSimple(String nombre, String descripcion,double precioBase, boolean especial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.especial=especial;
    }

    @Override
    public double calcularPrecio() {
        if(especial){
            return precioBase * 1.7;
        }
        return precioBase;
    }

    @Override
    public String toString() {
        return "PizzaSimple{" +
                "precioBase=" + precioBase +
                '}';
    }
}
