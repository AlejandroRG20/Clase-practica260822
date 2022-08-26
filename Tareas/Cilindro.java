package Tareas;

public class Cilindro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
				double r, h, g, Pbase, Abase, areaLateral, volumen, areaTotal;
				
				//Datos de entrada
				h = 20;
				r = 5;
				
				//Procesamiento de datos
				
				Pbase = (2*Math.PI*r);
				Abase = (Math.PI*r+r);
				areaLateral = (Pbase*g)/2;
				areaTotal = areaLateral + Abase;
				volumen = (Abase * h)/3;
				
				//Datos de Salida
				
				System.out.println("1.El AREA TOTAL del Cono es: " + areaTotal);
				System.out.println("2.El AREA LATERAL del Cono es: " + areaLateral);
				System.out.println("2.El VOLUMEN del Cono es: " + volumen);
				System.out.println("--------------------------------------------------");
	}

}
