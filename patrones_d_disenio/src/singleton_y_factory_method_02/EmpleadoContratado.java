package singleton_y_factory_method_02;

public class EmpleadoContratado extends Empleado{
    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }
    @Override
    public Double calcularSueldos(Integer diasTrabajados) {
        Double sueldoTotal = importePorHora * 8 * diasTrabajados;
        return sueldoTotal - sueldoTotal*retencionImpuesto;
    }
}
