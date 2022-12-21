package observer_04;

public class Test {
    public static void main(String[] args) {
        CentralItinerarios centralItinerarios = new CentralItinerarios();
        Portal portal = new Portal();
        Vuelos vuelo_01 = new Vuelos("argentina", "dubai", "2022");
        Vuelos vuelo_02 = new Vuelos("dubai", "argentina", "2023");

        centralItinerarios.addObserver(portal);
        centralItinerarios.addVuelos(vuelo_01);
        centralItinerarios.addVuelos(vuelo_02);
    }
}
