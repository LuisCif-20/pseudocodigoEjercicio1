import java.util.*;
public class Ejercicio1{
	public static void main(String[] args) {
		int numero1;
		int contadorpar = 0;
		int contadorimpar = 0;
		Scanner scan = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.println("Ingresa un numero");
		numero1 = scan.nextInt();
		for (int i = 0; i < numero1 ; i++ ) {
			int numrandom = aleatorio.nextInt(100) + 1;
			int par = numrandom % 2;
			System.out.println(numrandom);
			if (par == 0) {
				contadorpar += 1;
			} else {
				contadorimpar += 1;
			}
		}
		System.out.println("Hay " + contadorpar + " numeros pares");
		System.out.println("Hay " + contadorimpar + " numeros impares");
	}
}