package singleton_y_factory_method_02;

public class EmpleadoFactory {
    public static final String CLAVE_EMPLEADO_RELACION = "EMP-RD";
    public static final String CLAVE_EMPLEADO_CONTRATADO = "EMP-PH";
    private static EmpleadoFactory instance;
    private EmpleadoFactory(){

    }
    public static EmpleadoFactory getInstance(){
        if (instance==null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo){
        switch (codigo){
            case CLAVE_EMPLEADO_RELACION:
                return new EmpleadoRelacionDependencia("Maria","Gomez",1,1000.0);
            case CLAVE_EMPLEADO_CONTRATADO:
                return new EmpleadoContratado("Juan","Perez",2,7.0,0.14);
        }
        return null;
    }
}
