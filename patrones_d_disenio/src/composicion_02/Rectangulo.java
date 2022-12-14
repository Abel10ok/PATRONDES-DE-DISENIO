package composicion_02;

public class Rectangulo implements Figuras{

    private Double alto;
    private Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return alto * largo;
    }
}
