
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el año para saber si es bisiesto");
		
		int anio =  sc.nextInt();
		sc.close();
		boolean esBis;
		esBis = esBisiesto(anio);
		
		if (esBis) {
			System.out.printf("El año %d es bisiesto", anio);
		}
		else
			System.out.println("No es bisiesto");

	}
	
	static boolean esBisiesto(int anio) {
		boolean bisiesto = false;
		
		if (anio % 100 == 0) {
			
			if (anio % 400 == 0) {
				bisiesto = true;
			}
			
			else bisiesto = false;
		}
		
		else if (anio % 4 == 0 ) {
			
			bisiesto = true;
		}
		
		return bisiesto;
	}

}
