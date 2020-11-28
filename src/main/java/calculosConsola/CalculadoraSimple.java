package calculosConsola;

import java.util.List;

public class CalculadoraSimple implements CalculadoraComisiones{

	public int totalVenta = 0;
	public int comision = 0;
	
	@Override
	public int calcula(List<Integer> ventas) {
		
		if(ventas.isEmpty()) {
			System.out.println("no hay ventas desde donde calcular una comisión");
			return 0;
		}else {
			for(int i=0; i< ventas.size(); i++) {
				totalVenta = totalVenta + ventas.get(i);
			}
			
			if(totalVenta>10000) {
				comision = (int) (totalVenta*0.1);
			}else {
				comision = (int) (totalVenta*0.05);
			}
		}
		return comision;
	}
}


