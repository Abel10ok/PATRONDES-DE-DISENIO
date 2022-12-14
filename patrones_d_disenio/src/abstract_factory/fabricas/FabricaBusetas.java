package abstract_factory.fabricas;
import abstract_factory.clases.Buseta;
import abstract_factory.interfaces.Vehiculo;
import abstract_factory.interfaces.VehiculoDeTransporte;


import javax.swing.JOptionPane;



/**
 * Clase que permite la creacion de un objeto Buseta
 * @author chenao
 *
 */
public class FabricaBusetas implements VehiculoDeTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		Buseta miBuseta=new Buseta();
		miBuseta.setCodigo(miBuseta.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Buseta  ");
		return miBuseta;
	}



}
