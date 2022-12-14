package singleton_y_factory_method_02;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<Empleado>();
    }
    public Double calcularSueldoTotales(Integer diasTrabajados){
        Double sueldosTotales = 0.0;
        for (Empleado empleado : empleadoList) {
            sueldosTotales += empleado.calcularSueldos(diasTrabajados);
        }
        return sueldosTotales;
    }
    public void agregarEmpleado(Empleado empleado){
        empleadoList.add(empleado);
    }
}
