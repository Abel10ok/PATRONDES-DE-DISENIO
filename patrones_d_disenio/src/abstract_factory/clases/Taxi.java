package abstract_factory.clases;
import abstract_factory.interfaces.Vehiculo;


import javax.swing.JOptionPane;


/**
 * clase que establece el codigo del servicio de taxis
 * @author chenao
 *
 */
public class Taxi implements Vehiculo {
	
	private int codigo;


	@Override
	public int generarCodigo()
	{
		/**Generamos un codigo aleatorio para el taxi*/
		int codigoTaxi=(int) (Math.random()*9999);
		return codigoTaxi;
	}

	@Override
	public void codigoDeVehiculo() {
		JOptionPane.showMessageDialog(null,"El Codigo del Taxi es : "+getCodigo());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



}
