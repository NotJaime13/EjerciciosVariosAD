import java.awt.datatransfer.FlavorEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.FieldPosition;

public class Ejercicio7 {

    //7. Realiza un programa que escriba los primeros 20 números primos en un fichero
    //de nombre numprimos.txt. Después visualiza el contenido del archivo. Se creará el
    //método EsPrimo().

    public static void main(String[] args) throws IOException {
        int num = 0;
        FileWriter f1 = new FileWriter("C:\\Users\\jaime\\Desktop\\Clase\\ADatos\\NumPrimo.txt");
        FileReader f2 = new FileReader("C:\\Users\\jaime\\Desktop\\Clase\\ADatos\\NumPrimo.txt");
        do {
            if (esPrimo(num) == true) {
                f1.write(String.valueOf(num) + "\t");
            }
            num++;
        } while (num <= 20);
        f1.close();
        int valor = f2.read();
        while (valor != -1) {
            System.out.print((char) valor);
            valor = f2.read();
        }

        f2.close();
    }


    public static boolean esPrimo(int a) {
        if (a == 0 || a == 1 || a == 4) {
            return false;
        }
        for (int x = 2; x < a / 2; x++) {
            if (a % x == 0)
                return false;
        }
        return true;
    }
}
