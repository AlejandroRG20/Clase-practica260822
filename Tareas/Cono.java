package prueba2;

public class Cono {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Declaracion de variables
					double r, h, g, Pbase, Abase, areaLateral, volumen, areaTotal;
					
					//Datos de entrada
					h = 20;
					r = 5;
					
					//Procesamiento de datos
					
					g = Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2));
					Pbase = (2*Math.PI*r);
					Abase = (Math.PI*(Math.pow(r,  2)));
					areaLateral = (Pbase*g)/2;
					areaTotal = areaLateral + Abase;
					volumen = (Abase * h)/3;
					
					//Datos de Salida
					System.out.println("--------------------------------------------------- ");
					System.out.println("1.La altura del Cono es: " + h);
					System.out.println("2.El radio del Cono es: " + r);
					System.out.println("3.El Perimetro de la base del Cono es: " + 	String.format("%.2f", Pbase));
					System.out.println("4.El Area de la base del Cono es: " + String.format("%.2f", Abase));
					System.out.println("5.La generatris del Cono es: " + String.format("%.2f", g));
					System.out.println("6.El AREA TOTAL del Cono es: " + String.format("%.2f", areaTotal));
					System.out.println("7.El AREA LATERAL del Cono es: " + String.format("%.2f", areaLateral));
					System.out.println("8.El VOLUMEN del Cono es: " + String.format("%.2f", volumen));
					System.out.println("--------------------------------------------------");

	}

}
