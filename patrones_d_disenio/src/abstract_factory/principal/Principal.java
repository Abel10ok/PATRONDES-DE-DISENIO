package abstract_factory.principal;
import javax.swing.JOptionPane;

import abstract_factory.fabricas.FabricaBuses;
import abstract_factory.fabricas.FabricaBusetas;
import abstract_factory.fabricas.FabricaDeVehiculos;
import abstract_factory.fabricas.FabricaTaxis;
/**
 * clase principal del aplicativo donde se establecen las instancias de las fabricas
 * @author chenao
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		FabricaBusetas busetas=new FabricaBusetas();
		FabricaTaxis taxi=new FabricaTaxis();
		FabricaBuses buses=new FabricaBuses();
		String cad="",salida;
		cad+="Ingrese la opci�n correspondiente para obtener \nel codigo del servicio\n\n";
		cad+="1. Codigo servicio de Taxis\n";
		cad+="2. Codigo servicio de Buses\n";
		cad+="3. Codigo servicio de Busetas\n\n";
		try {
			do {
				try 
				{
					int opcion=Integer.parseInt(JOptionPane.showInputDialog(cad));
					
					switch (opcion)
					{
					case 1: FabricaDeVehiculos.crearFabricaDeVehiculo(taxi);
						break;
					case 2: FabricaDeVehiculos.crearFabricaDeVehiculo(buses);
						break;
					case 3: FabricaDeVehiculos.crearFabricaDeVehiculo(busetas);
						break;
					default: JOptionPane.showMessageDialog(null,"No es un valor de consulta valido");
						break;
						}
				} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"No es un parametro de consulta valido");
					}
			salida=JOptionPane.showInputDialog("Desea consultar otro codigo? S/N");
			
			} while (salida.toUpperCase().equals("S"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Bye!!!");
		}
		
		
	}

}
