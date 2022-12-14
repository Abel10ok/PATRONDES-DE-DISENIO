package objetos_patrones_de_disenio;

public class pruebaStatica {

    public static int multiplicar(int n, int m){
        return n*m;
    }

    public static void sumar(){
        System.out.println(multiplicar(2,2)+ multiplicar(2,2));
    }
    public static void main(String[] args) {
        System.out.println(multiplicar(2,3));
        System.out.println(multiplicar(3,4));
        sumar();
    }
}
