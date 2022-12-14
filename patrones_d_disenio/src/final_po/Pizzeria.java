package final_po;


import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> pizzasList;

    public Pizzeria() {
        pizzasList = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        pizzasList.add(pizza);
    }

    public void generarInforme(){
        for (Pizza pizza : pizzasList) {
            System.out.println(pizza);
        }
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "pizzasList=" + pizzasList +
                '}';
    }
}
