package reto3;

import java.util.Scanner;

/* o	Muestra los números de la frase separados por ‘,’ sin la última. ->1,2,0,2,5
o	Cifrado simple: reemplaza vocales (a→4, e→3, i→1, o→0, u→_) Ej: "Hola mundo" → "H0l4 m_nd0"
o	Muestra la palabra con más vocales.
o	Muestra la palabra más corta. */
public class Funciones3 {
	public static void numerosEnFrase(String frase) {
				

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (Character.isDigit(letra)) {
					System.out.print(letra+",");
			}

		}
		
	}
	// 	Cifrado simple: reemplaza vocales (a→4, e→3, i→1, o→0, u→_) Ej: "Hola mundo" → "H0l4 m_nd0"
	public static String  cifradoSimple(String frase) {
		
		frase= frase.replace('a', '4');
		frase= frase.replace('e', '3');
		frase= frase.replace('i', '1');
		frase= frase.replace('o', '0');
		return frase= frase.replace('u', '+');
		
		}
		
	// Muestra la palabra con más vocales.
	public static int contarVocales(String frase) {
		return 0;

		}
		
		
	
	public static String palabraCorta(String frase) {
		return frase;
		
		
	}
	public static void main(String[] args) {
		numerosEnFrase("h2l3 45mn");
		System.out.println(cifradoSimple("\nhola como estas"));
	
		
	}

}

