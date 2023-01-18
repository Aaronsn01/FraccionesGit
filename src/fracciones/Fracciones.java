package fracciones;

import java.util.Scanner;

public class Fracciones {
	int n1,d1,n2,d2;
	int numerador, denominador;
	
	void leerFracciones(Scanner leer) {
		System.out.println("Fracción 1:");
		System.out.println("numerador:");
		n1=leer.nextInt();
		System.out.println("denominador:");
		d1=leer.nextInt();
		
		System.out.println("Fracción 2:");
		System.out.println("numerador:");
		n2=leer.nextInt();
		System.out.println("denominador:");
		d2=leer.nextInt();
	}
	
	void escribirFraccion() {
		System.out.println("El resultado es: = " + numerador + "/" + denominador);
	}
	
	void sumarFracciones() {
		numerador = n1*d2 + d1*n2;
		denominador = d1 * d2;
	}

	void multiplicarFracciones(){
		numerador = n1 * n2;
		denominador = d1 * d2;
	}
	


	
	void menu() {
		
		int opcion = 0;
		Scanner leer;
		
		do {
			System.out.println("#####################");
			System.out.println("MENÚ:");
			System.out.println("1-sumar");
			System.out.println("2-restar");
			System.out.println("3-multiplicar");
			System.out.println("4-dividir");
			System.out.println("5-salir");
			
			System.out.println("Introduce opción:");
			leer = new Scanner(System.in);
			opcion = leer.nextInt();
			
			if(opcion>0 && opcion<5) {				
				leerFracciones(leer);
			}
			
			switch (opcion) {
				case 1: {
					sumarFracciones();
					escribirFraccion();
					break;
				}
				case 2: {

					break;
				}
				case 3: {
					multiplicarFracciones();
					escribirFraccion();
					break;
				}
				case 4: {

					break;
				}
				case 5: {
					System.out.println("Saliendo del programa");
					break;
				}
				default:{
					System.out.println("Opción incorrecta");
				}
			}
			
		}while(opcion != 5);
	}
	
	
	
	public static void main(String[] args) {
		
		new Fracciones().menu();		
		
	}

}


