package state_04;

import java.util.List;

public interface EstadoCarrito {
    void agergar(Producto producto, List<Producto> productos) throws EstadoErroneoException;
    EstadoCarrito cancelar() throws EstadoErroneoException;
    EstadoCarrito volver() throws EstadoErroneoException;
    EstadoCarrito avanzar() throws EstadoErroneoException;
}
