import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		 BufferedReader bf = new BufferedReader (new InputStreamReader(System.in)); 
		 System.out.println("Introduzca un texto: ");
		 String linea = bf. readLine();
		 linea = linea.toLowerCase();
		 char [] caracteres;
		 caracteres = new char[linea.length()];
		
		 Arrays.sort(caracteres);
		 for (int x = 0; x < linea.length();x++) {
			 
			 caracteres[x] = linea.charAt(x);
			 
		 }
		 
		 for (char i : caracteres) {
	            System.out.print(i + ", ");
	        }

	}

}
