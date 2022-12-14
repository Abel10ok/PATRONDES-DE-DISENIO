package final_po;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends  Pizza{

    private List<Pizza> combinada;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        combinada = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        combinada.add(pizza);
    }

    @Override
    public double calcularPrecio() {
        double precio=0;
        for (Pizza pizza : combinada) {
            precio += pizza.calcularPrecio();
        }
        return precio/2;
    }

    @Override
    public String toString() {
        return "PizzaCombinada{"
                 + getNombre() +"="+ calcularPrecio()+
                '}';
    }
}
