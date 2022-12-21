package observer_02;

public class Test {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nacho","Gibbs");

        usuario.agregar(new Seguidor("Javier", "Ramos"));
        usuario.agregar(new Seguidor("Nico","Di Fabio"));
        usuario.agregar(new Seguidor("David","Gutierrez"));

        usuario.subirFoto();
    }
}
