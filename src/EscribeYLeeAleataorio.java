import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class EscribeYLeeAleataorio {

    public static void escrbirEmple(int metido, int dpt, int id, double salario, String apellido) throws IOException {
        File fichero = new File("AleatoryEmple.dat");
        //declara el fichero de acceso aleatorio
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        //arrays con los datos

        StringBuffer buffer = null;//buffer para almacenar apellido

        file.writeInt(metido); //uso i+1 para identificar empleado
        buffer = new StringBuffer(apellido);
        buffer.setLength(10);
        file.writeChars(buffer.toString());
        file.writeInt(dpt); //insertar departamento
        file.writeDouble(salario);//insertar salario
        file.close(); //cerrar fichero
    }

    public static boolean leerEmple(int metido) throws IOException {
        File fichero = new File("AleatoryEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r"); //declara el fichero de acceso aleatorio
        int id, posicion;
        posicion = 0; //para situarnos al principio
        do { //recorro el fichero
            file.seek(posicion); //nos posicionamos en posicion
            id = file.readInt(); // obtengo id de empleado
            if (id == metido){
                System.out.println("El id ya existe");
                file.close();
                return true;
            }
        } while (file.getFilePointer() != file.length());
        file.close(); //cerrar fichero
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int opc = 5;

        do{

        }while (opc != 0);
    }
}
