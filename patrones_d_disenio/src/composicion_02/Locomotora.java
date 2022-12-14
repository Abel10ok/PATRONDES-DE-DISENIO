package composicion_02;

import java.util.ArrayList;
import java.util.List;

public class Locomotora implements  Figuras{

    private List<Figuras> locomotora;

    public Locomotora() {
        this.locomotora = new ArrayList<>();
    }

    public void addFiguras(Figuras figura){
        locomotora.add(figura);
    }

    @Override
    public double calcularArea() {
        double area = 0.0;
        for (Figuras figuras : locomotora) {
            area += figuras.calcularArea();
        }
        return area;
    }
}
