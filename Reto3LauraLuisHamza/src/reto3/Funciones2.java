package reto3;

public class Funciones2 {

    public static int contarPalabras(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') contador++;
        }

        System.out.println("Número de palabras: " + contador);
        return contador;
    }

    public static String invertirFrase(String frase) {
        String palabra = "";
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                palabra += c;
            } else {
                resultado = palabra + " " + resultado;
                palabra = "";
            }
        }

        return resultado;
    }

    public static String palabraLarga(String frase) {
        String palabra = "";
        String mayor = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                palabra += c;
            } else {
                if (palabra.length() > mayor.length()) {
                    mayor = palabra;
                }
                palabra = "";
            }
        }

        return mayor;
    }
}
