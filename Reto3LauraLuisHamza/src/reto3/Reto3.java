package reto3;

import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Analizar nombres");
            System.out.println("2. Analizar frase");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Funciones1.menu1(sc);
                    break;

                case 2:
                    System.out.println("Introduce una frase: ");
                    String frase = sc.nextLine() + " ";

                    // Parte 1 Alumno 2
                    Funciones2.contarPalabras(frase);
                    System.out.println("Frase invertida: " + Funciones2.invertirFrase(frase));
                    System.out.println("Palabra más larga: " + Funciones2.palabraLarga(frase));

                    // Parte 2 Alumno 3
                   System.out.println("Números en la frase: " + Funciones3.numerosEnFrase(frase));
                    System.out.println("Cifrado: " + Funciones3.cifradoSimple(frase));
                    System.out.println("Palabra con más vocales: " + Funciones3.palabraMasVocales(frase));
                    System.out.println("Palabra más corta: " + Funciones3.palabraCorta(frase));
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
