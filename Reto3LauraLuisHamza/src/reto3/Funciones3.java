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
		int numVocales = 0;
		String espacio=" ";
		for (int j = 0; j < frase.length(); j++) {
			
		}

		String vocales = "aeiouáéíóú";
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (vocales.contains(String.valueOf(letra))) {
				numVocales++;
			}
		}



		}
		
		
	
	public static String palabraCorta(String frase) {
		  String palabra = "";
	        String menor = "";

	        for (int i = 0; i < frase.length(); i++) {
	            char c = frase.charAt(i);

	            if (c != ' ') {
	                palabra += c;
	            } else {
	                if (menor.length()<palabra.length()) {
	                    menor = palabra;
	                }
	                palabra = "";
	            }
	        }

	        return menor;
	
		
		
	}
	public static void main(String[] args) {
		numerosEnFrase("h2l3 45mn");
		System.out.println(cifradoSimple("\nhola como estas"));
		System.out.println(palabraCorta("holalorena como estas"));
		
	}

}

