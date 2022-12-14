package singleton_y_factory_method_02;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("DigitalHouse");
        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CLAVE_EMPLEADO_RELACION));
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CLAVE_EMPLEADO_CONTRATADO));

        System.out.println(empresa.calcularSueldoTotales(30));
    }
}
