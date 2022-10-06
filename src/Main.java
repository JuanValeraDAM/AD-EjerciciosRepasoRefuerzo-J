import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
/*
Haz un programa Java que lea un fichero de texto plano con varias líneas, que pueda contener palabras
entrecomilladas en cualquier parte. El programa debe visualizar la cantidad total de palabras que hay,
y mostrar aquellas que están entrecomilladas. Puedes suponer lo siguiente:

que no hay símbolos aparte de comillas, letras y caracteres de espaciado y nueva línea;
que lo que hay entre comillas siempre es una palabra completa (sin espacios).
 */

        Path fichero = Paths.get("fichero.txt");
        String todoElTexto = Files.readString(fichero);

        int cantidadPalabras = todoElTexto.split("\\s+").length;
        String[] palabras = todoElTexto.split("\\s+");
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].contains("\"")) {
                System.out.println(palabras[i]);
            }
        }


    }
}