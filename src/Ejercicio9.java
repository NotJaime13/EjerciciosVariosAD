import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {

    //9. Programa que lee enteros por teclado y los escribe en el fichero binario “datos.dat”.

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Indiqueme el numero de enteros a ingresar: ");
        int num = input.nextInt();
        FileWriter kk = new FileWriter("C:\\Users\\jaime\\Desktop\\Clase\\ADatos\\Datos.dat");
        do{
            System.out.println("Ingrese un entero.");
            int numero = input.nextInt();;
            kk.write(numero);
            num--;
        }while(0 < num);

        kk.close();
    }
}
