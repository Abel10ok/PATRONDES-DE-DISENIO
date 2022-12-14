package composicion_02;

public class Circulo implements  Figuras{

    private Double radio;

    public Circulo(Double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio * radio * 3.14;
    }
}
