package Tareas;

public class Cono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
		double r, h, g, Pbase, Abase, areaLateral, volumen, areaTotal;
		
		//Datos de entrada
		h = 4;
		r = 8;
		
		//Procesamiento de datos
		
		g = Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2));
		Pbase = (2*Math.PI*r);
		Abase = (Math.PI * (Math.pow(r, 2)));
		areaLateral = (Pbase*g)/2;
		areaTotal = areaLateral + Abase;
		volumen = (Abase * h)/3;
		
		//Datos de Salida
		
		System.out.println("1.El AREA TOTAL del Cono es: " + areaTotal);
		System.out.println("2.El AREA LATERAL del Cono es: " + areaLateral);
		System.out.println("2.El VOLUMEN del Cono es: " + volumen);
		System.out.println("--------------------------------------------------");
		System.out.println(" g es  " + g);
		
	}

}
