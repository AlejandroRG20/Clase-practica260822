package prueba2;

public class piramide {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
				double l, h, ap, Ap, Pbase, Abase, areaLateral, volumen, areaTotal;
				
				//Datos de entrada
				h = 13;
				l = 5;
				
				//Procesamiento de datos
				
				ap = l/2;
				Ap = Math.sqrt(Math.pow(h, 2)+ Math.pow(ap, 2));
				Pbase = 4*l;
				Abase = l*l;
				areaLateral = (Pbase*Ap)/2;
				areaTotal = areaLateral + Abase;
				volumen = (Abase * h)/3;
				
				//Datos de Salida
				System.out.println("--------------------------------------------------- ");
				System.out.println("1.La altura dela piramide es: " + h);
				System.out.println("2.La LONGITUD de los lados de la piramide es: " + l);
				System.out.println("3.El Perimetro de la base de la piramide es: " + 	String.format("%.2f", Pbase));
				System.out.println("4.El Area de la base de la piramide es: " + String.format("%.2f", Abase));
				System.out.println("6.El AREA TOTAL de la piramide es: " + String.format("%.2f", areaTotal));
				System.out.println("7.El AREA LATERAL de la piramide es: " + String.format("%.2f", areaLateral));
				System.out.println("8.El VOLUMEN de la piramide es: " + String.format("%.2f", volumen));
				System.out.println("--------------------------------------------------");

	}
}
