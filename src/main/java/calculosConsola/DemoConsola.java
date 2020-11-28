package calculosConsola;

import java.util.List;

public class DemoConsola {
	
	private static List<Integer> listaValores;
	private static CalculadoraSimple cs;
	private static CalculadoraCompleja cc;

	public static void main() {		
		 // llena el arreglo con valores random
		for(int i=0; i<5; i++) {
			int num = (int) (Math.random()*20000)+1000;			
			listaValores.set(i, num);
		}
		
		System.out.println("Demostracion Calculadora de Comisiones\n\n");
		
		System.out.println("tomados 5 numeros aleatorios...\n");
		
		for(int i=0;i<5;i++) {
			System.out.println(listaValores.get(i));
		}
		
		System.out.println("\nDescuento con Algoritmo simple: \n");
		System.out.println(cs.calcula(listaValores));
		
		System.out.println("\nDescuento con Algoritmo complejo: \n");
		System.out.println(cc.calcula(listaValores));	
		
	}
	
}