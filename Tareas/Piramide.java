package Tareas;

public class Piramide {

	public static void main(String[] args) {
		//Declaracion de variables
				double r, Pbase, h, n, l, Abase, areaLateral, volumen, areaTotal, ap, Ap;
				
				//Datos de entrada
				h = 13;
				r = 6;
				n = 5;
				l = 5;
				Pbase = 10;
				
				//Procesamiento de datos
				
				ap = l/(2*Math.tan(360/n)/2);
				Ap = Math.sqrt(h*h + ap*ap);
				Abase = (l*l);
				areaLateral = (Pbase*Ap)/2;
				areaTotal = areaLateral + Abase;
				volumen = ((Abase * h)*h)/3;
				
				//Datos de Salida
				
				System.out.println("-------------------BIENVENIDO---------------------");
				System.out.println("1.El AREA TOTAL de la piramide es: " + areaTotal);
				System.out.println("2.El AREA LATERAL de la piramide es: " + areaLateral);
				System.out.println("2.El VOLUMEN de la piramide es: " + volumen);
				System.out.println("3.El area de la base: " + Abase);
				System.out.println("--------------------------------------------------");

	}

}
