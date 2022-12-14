package composicion_02;

import java.util.ArrayList;
import java.util.List;

public class Vagon implements Figuras{
    private List<Figuras> vagon;

    public Vagon() {
        this.vagon = new ArrayList<>();
    }

    public void addFiguras(Figuras figura){
        vagon.add(figura);
    }

    @Override
    public double calcularArea() {
        double area=0.0;
        for (Figuras figuras : vagon) {
            area += figuras.calcularArea();
        }
        return area;
    }
}
