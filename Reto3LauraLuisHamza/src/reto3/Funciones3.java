package reto3;

public class Funciones3 {

    public static String numerosEnFrase(String frase) {
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isDigit(c)) {
                resultado += c + ",";
            }
        }

        if (resultado.endsWith(",")) {
            resultado = resultado.substring(0, resultado.length() - 1);
        }

        return resultado;
    }

    public static String cifradoSimple(String frase) {
        String r = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            switch (Character.toLowerCase(c)) {
                case 'a': r += '4'; break;
                case 'e': r += '3'; break;
                case 'i': r += '1'; break;
                case 'o': r += '0'; break;
                case 'u': r += '_'; break;
                default: r += c;
            }
        }

        return r;
    }

    public static int contarVocales(String palabra) {
        int v = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = Character.toLowerCase(palabra.charAt(i));

            if ("aeiou".indexOf(c) >= 0) v++;
        }

        return v;
    }

    public static String palabraMasVocales(String frase) {
        String palabra = "";
        String mayor = "";
        int maxVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                palabra += c;
            } else {
                int v = contarVocales(palabra);
                if (v > maxVocales) {
                    maxVocales = v;
                    mayor = palabra;
                }
                palabra = "";
            }
        }

        return mayor;
    }

    public static String palabraCorta(String frase) {
        String palabra = "";
        String menor = "";
        boolean primera = true;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                palabra += c;
            } else {
                if (primera || palabra.length() < menor.length()) {
                    menor = palabra;
                    primera = false;
                }
                palabra = "";
            }
        }

        return menor;
    }
}
