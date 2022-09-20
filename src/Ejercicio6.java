import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        FileWriter f1 = new FileWriter("C:\\Users\\jaime\\Desktop\\Clase\\ADatos\\Miau.txt");
        FileReader f2 = new FileReader("C:\\Users\\jaime\\Desktop\\Clase\\ADatos\\Miau.txt");

        int num = 0;

        do {
            f1.write(String.valueOf(num) + "\n");
            num++;
        } while (num <= 100);

        f1.close();
        int valor = f2.read();
        while (valor != -1) {
            System.out.print((char)valor);
            valor = f2.read();
        }

        f2.close();

    }
}
