package abstract_factory.fabricas;

import abstract_factory.interfaces.Vehiculo;
import abstract_factory.interfaces.VehiculoDeTransporte;

/**
 * Clase que permite la creacion de un servicio 
 * @author chenao
 *
 */
public class FabricaDeVehiculos {
	
	public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory)
	{
		/**Aplicamos Polimorfismo*/
		Vehiculo objetoVehiculo= factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}

}
