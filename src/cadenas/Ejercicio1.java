package cadenas;

import utilidades.Entrada;
/*
 * Programa que pide una palabra por teclado y dice
 * si es panvocálica o no.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		String palabra;
		char continua;
		//Contadores de vocales
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		do {
			System.out.println("Introduce una palabra para saber si es panvocálica o no: ");
			palabra = Entrada.cadena();
			/*
			 * Con este bucle recorremos la cadena y con el switch
			 * actualizamos los contadores.
			 */
			for(int i=0; i<palabra.length(); i++) {
				switch(palabra.charAt(i)) {
					case 'a':
						contadorA++;
						break;
					case 'e':
						contadorE++;
						break;
					case 'i':
						contadorI++;
						break;
					case 'o':
						contadorO++;
						break;
					case 'u':
						contadorU++;
				}
			}
			
			if(contadorA>0 && contadorE>0 && contadorI>0 && contadorO>0 && contadorU>0) {
				System.out.printf("La palabra %s es panvocálica.\n", palabra);
			}else {
				System.out.printf("La palabra %s no es panvocálica.\n", palabra);
			}
			
			System.out.println("¿Quieres probar con otra palabra? (s/n)");
			continua = Entrada.caracter();
			
			contadorA=0;
			contadorE=0;
			contadorI=0;
			contadorO=0;
			contadorU=0;
			
		}while(continua == 's');

	}

}
