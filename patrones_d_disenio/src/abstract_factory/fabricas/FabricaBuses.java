package abstract_factory.fabricas;
import abstract_factory.clases.Bus;
import abstract_factory.interfaces.Vehiculo;
import abstract_factory.interfaces.VehiculoDeTransporte;

import javax.swing.JOptionPane;


/**
 * Clase que permite la creacion de un objeto Bus
 * @author chenao
 *
 */
public class FabricaBuses implements VehiculoDeTransporte {
	
	public Vehiculo crearVehiculo() {

		Bus miBus=new Bus();
		miBus.setCodigo(miBus.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Bus  ");
		return miBus;
	}

}
