package final_po;

public class Test {
    public static void main(String[] args) {
    Pizzeria pizzeria = new Pizzeria();

    PizzaFactory pizzaFactory = PizzaFactory.getInstance();

    pizzeria.addPizza(pizzaFactory.crearPizza("muzzarella"));
    pizzeria.addPizza(pizzaFactory.crearPizza("margarita"));
    pizzeria.addPizza(pizzaFactory.crearPizza("anana"));
    pizzeria.addPizza(pizzaFactory.crearPizza("combinada"));

    pizzeria.generarInforme();




    }
}
