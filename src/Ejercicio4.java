public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumaMatrizMayor;

		int[][] matriz = { { 1, 5, 5, 2, 4 }, { 2, 1, 4, 14, 3 }, { 3, 7, 11, 2, 8 }, { 4, 8, 12, 16, 4 } };

		sumaMatrizMayor = max3x3sum(matriz);

		System.out.println(
				"La suma mayor de una matriz de 3 x 3 contenida en la matriz inicial es de " + sumaMatrizMayor);
	}

	static int max3x3sum(int[][] matriz) {

		int sumaValores3x3 = 0;
		int mayor = 0;
		int indiceA = 0;
		int indiceB = 0;
		int contador = 0;
		int contador2 = 0;
		// bucle que controla la pòsicion de partida para la suma de 3 x 3
		while (contador < matriz.length - 3 && contador2 < matriz[0].length - 3) {

			// bucles que controlan el indici de suma para que siempre sumen casillas de 3 x
			// 3
			while (indiceA < 3) {
				while (indiceB < 3) {
					// entramos a = 0, b = 0
					sumaValores3x3 = sumaValores3x3 + matriz[indiceA + contador2][indiceB + contador];

					// b = 0, b=1, b = 2, seguimos
					indiceB++;

				}
				// reiniciamos b, y a pasa a valer 1, con lo que a = 1, b = 0, 1, 2
				indiceB = 0;
				indiceA++;
			}
			// cuando A a pasa a valer 3 venimos aqui u la ponemos a 0
			indiceA = 0;
			// si es la mayor suma la almacenamos
			if (sumaValores3x3 > mayor) {

				mayor = sumaValores3x3;

			}
			// con la a en 0 le sumamos un contador para iniciar en el siguiente
			// siempre aumentaremos el contador mientras cumpla la primera condicion
			// ademas al aumentarlo aqui lo usamos para ver si llegara al final en el
			// proximo if
			contador++;
			// si hemos llegado al final de la matriz para no pasarnos reiniciamos el
			// contador i aumentamos el 2 contador, es quien controlara las posiciones
			// cuando alcance el limite
			if ((contador) == matriz.length - 3) {
				contador = 0;
				contador2++;
			}
		}

		return mayor;

	}

}
