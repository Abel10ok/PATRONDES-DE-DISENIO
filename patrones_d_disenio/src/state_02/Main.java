package state_02;

public class Main {
    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi();
        tamagochi.darDeBeber();
        tamagochi.darDeComer();
        tamagochi.darMimos();
        tamagochi.darMimos();
        tamagochi.darDeComer();
        tamagochi.darDeComer();
        System.out.println(tamagochi.getEstadoActual());
    }
}
