package composicion_02;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {

        Tren tren = new Tren();

        Rectangulo rec_1 = new Rectangulo(5.0,4.0);
        Rectangulo rec_2 = new Rectangulo(6.0,4.0);

        Circulo cir_1 = new Circulo(1.0);

        Triangulo tri_1 = new Triangulo(2.0, 2.0);

        Vagon vagon = new Vagon();
        vagon.addFiguras(rec_1);
        vagon.addFiguras(cir_1);
        vagon.addFiguras(cir_1);
        vagon.addFiguras(cir_1);

        System.out.println(vagon.calcularArea());

        Locomotora locomotora = new Locomotora();
        locomotora.addFiguras(rec_2);
        locomotora.addFiguras(cir_1);
        locomotora.addFiguras(cir_1);
        locomotora.addFiguras(tri_1);

        System.out.println(locomotora.calcularArea());

        tren.addFiguras(locomotora);
        tren.addFiguras(vagon);

        System.out.println(tren.calcularArea());

    }
}
