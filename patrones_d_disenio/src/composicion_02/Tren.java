package composicion_02;

import java.util.ArrayList;
import java.util.List;

public class Tren implements  Figuras{

    private List<Figuras> tren;

    public Tren(){
        tren = new ArrayList<>();
    }

    public void addFiguras(Figuras figura){
        tren.add(figura);
    }

    @Override
    public double calcularArea() {
        double area = 0.0;
        for (Figuras figuras : tren) {
            area += figuras.calcularArea();
        }
        return area;
    }
}
