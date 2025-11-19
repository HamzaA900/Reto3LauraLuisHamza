package reto3;

import java.util.Scanner;

public class Funciones1 {

    public static void menu1(Scanner sc) {
        String palabra = "";
        String menor = "";
        String primeroAlfa = "";
        boolean primera = true;

        System.out.println("Introduce nombres (vacío para terminar):");

        while (true) {
            palabra = sc.nextLine();

            if (palabra.equals("")) break;

            // Mostrar con primera mayúscula y resto minúscula
            String capitalizado = capitalizarString(palabra);
            System.out.println("→ " + capitalizado);

            // Longitud menor
            if (primera || palabra.length() < menor.length()) {
                menor = palabra;
            }

            // Alfabéticamente primero
            if (primera || palabra.compareToIgnoreCase(primeroAlfa) < 0) {
                primeroAlfa = palabra;
            }

            primera = false;

            // Apodo
            System.out.println("Apodo: " + generarApodo(palabra));
        }

        System.out.println("\n== RESULTADOS ==");
        if (!primera) {
            System.out.println("Nombre más corto: " + menor);
            System.out.println("Primer alfabéticamente: " + primeroAlfa);
        }
    }

    public static String capitalizarString(String s) {
        if (s.length() == 0) return "";
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String generarApodo(String palabra) {
        int len = palabra.length();

        if (len < 4) {
            return palabra + len;
        }

        return palabra.substring(0, 3) + palabra.charAt(len - 1) + len;
    }
}
