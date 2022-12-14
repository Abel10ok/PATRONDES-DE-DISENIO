package abstract_factory.fabricas;
import abstract_factory.clases.Taxi;
import abstract_factory.interfaces.Vehiculo;
import abstract_factory.interfaces.VehiculoDeTransporte;


import javax.swing.JOptionPane;


/**
 * Clase que permite la creacion de un objeto Taxi
 * @author chenao
 *
 */
public class FabricaTaxis implements VehiculoDeTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		Taxi miTaxi=new Taxi();
		miTaxi.setCodigo(miTaxi.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Taxi  ");
		return miTaxi;
	}

}
