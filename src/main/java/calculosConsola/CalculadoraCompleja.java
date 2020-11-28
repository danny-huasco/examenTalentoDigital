package calculosConsola;

import java.util.List;

public class CalculadoraCompleja implements CalculadoraComisiones{
	
	public int totalVenta = 0;
	public int comision = 0;
	
	
	@Override
	public int calcula(List<Integer> ventas) {
		
		if(ventas.isEmpty()) {
			System.out.println("no hay ventas desde donde calcular una comisión");
			return 0;
		}else {
			for(int i=0; i< ventas.size();i++) {
				totalVenta = totalVenta + ventas.get(i);
			}
			
			for(int i=0; i<ventas.size();i++) {
				if(5000 < ventas.get(i) && ventas.get(i)<= 10000) {
					comision = comision + (int)(ventas.get(i)*0.07);
				}else if(ventas.get(i)>10000) {
					comision = comision + (int)(ventas.get(i)*0.1);
				}else {
					comision = comision + (int)(ventas.get(i)*0.05);
				}
			}
			if(totalVenta>50000) {
				comision = comision + (int)(totalVenta*0.01);
			}
		}
		return comision;
	}
}
