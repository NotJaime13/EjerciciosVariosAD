import java.io.*;
import java.util.Scanner;

public class Ejercicio8 {

    //8. Escribir un método que reciba por parámetro dos rutas correspondientes a un archivo de origen y
    // otro de destino y que copie el archivo origen en la ubicación destino.
    // La ruta destino puede consistir en un directorio o un archivo. En el primer caso, el archivo se copiará
    // al directorio especificado manteniendo su nombre. En el segundo, se tomará como nombre del archivo copia el que especifique su ruta.

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce la ruta de origen: ");
        String ruta = input.next();
        System.out.println("Introduce la ruta de destine: ");
        String destine = input.next();
        Rutas(ruta, destine);
    }

    public static void Rutas(String Origen, String Destiny) throws IOException {
        FileReader origen = new FileReader(Origen);
        FileWriter destine1 = new FileWriter(Destiny);

        int Str = origen.read();

        while (Str != -1) {
            System.out.print((char) Str);
            Str = origen.read();
        }

        destine1.write(origen.read());

    }
}
