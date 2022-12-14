package final_po;


public class PizzaFactory {

    private static PizzaFactory instance;

    private PizzaFactory(){

    }
    public static PizzaFactory getInstance() {
        if (instance==null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String nombre){
        switch (nombre){
            case "muzzarella":
                return new PizzaSimple("Muzzarela","SOLO QUESO",700, false);
            case "margarita":
                return new PizzaSimple("margarita","con margarita",850,true);
            case "anana":
                return new PizzaSimple("anana","con anana", 950, false);
            case "combinada":
                PizzaCombinada pizzaCombinada = new PizzaCombinada("Loca", "pizza combinada");
                pizzaCombinada.addPizza(crearPizza("margarita"));
                pizzaCombinada.addPizza(crearPizza("anana"));
                return pizzaCombinada;
        }
        return null;
    }
}
