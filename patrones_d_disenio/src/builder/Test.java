package builder;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();

        // El director obtiene el objeto constructor concreto del cliente
        // (código de aplicación). Eso es porque la aplicación sabe mejor qué
        // constructor a usar para obtener un producto específico
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // El producto final a menudo se recupera de un objeto constructor, ya que
        // El director no es consciente y no depende de constructores concretos y
        // productos.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();
        // El director puede conocer varias recetas de construcción.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
