import java.io.*;
import java.util.Scanner;

public class EscribeYLeeAleataorio {

    static Scanner input = new Scanner(System.in);
    public static void escrbirEmple(int metido, int dpt, int id, double salario, String apellido) throws IOException {
        File fichero = new File("AleatoryEmple.dat");
        //declara el fichero de acceso aleatorio
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        //arrays con los datos
        int posicion = (metido -1) * 36;
        file.seek(posicion);

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
        try {
        File fichero = new File("AleatoryEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r"); //declara el fichero de acceso aleatorio
        int id, posicion;
        posicion = (metido -1) * 36; //para situarnos al principio

            do { //recorro el fichero
                file.seek(posicion); //nos posicionamos en posicion
                id = file.readInt(); // obtengo id de empleado
                if (id == metido) {
                    System.out.println("El id ya existe");
                    file.close();
                    return true;
                }
            } while (file.getFilePointer() != file.length());
            file.close(); //cerrar fichero
        }catch(EOFException E){
            return false;
        }catch(FileNotFoundException f){

            return false;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        do {
            switch (menu()) {
                case 1:
                    System.out.println("Introduce el ID.");
                    int id = input.nextInt();
                    System.out.println("dpto?");
                    int dpto = input.nextInt();
                    System.out.println("Salario?");
                    double salario = input.nextDouble();
                    System.out.println("APELLIDO?");
                    String ape = input.next();
                    if (leerEmple(id) == false){
                        escrbirEmple(id,dpto,id,salario,ape);
                    }

                    break;
                case 2:
                    System.out.println("Introduce el ID.");
                    int meti = input.nextInt();
                    leere(meti);
                    break;
            }
        } while (menu() != 0);
    }

    public static void leere(int metido) throws IOException {
        File fichero = new File("AleatoryEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");
        int id, dep, posicion;
        Double salario;
        char apellido[] = new char[10], aux;
        try {
            posicion = (metido - 1) * 36;
            if (posicion >= file.length())
                System.out.printf("ID: %d, NO EXISTE EMPLEADO...", metido);
            else {
                file.seek(posicion); //nos posicionamos
                id = file.readInt(); // obtengo id de empleado
                for (int i = 0; i < apellido.length; i++) {
                    aux = file.readChar();//recorro uno a uno los caracteres del apellido
                    apellido[i] = aux; //los voy guardando en el array
                }
                String apellidoS = new String(apellido);//convierto a String el array
                dep = file.readInt();//obtengo dep
                salario = file.readDouble(); //obtengo salario
                System.out.println("ID: " + metido + ", Apellido: " + apellidoS.trim() + ", Departamento: " + dep + ", Salario: " +
                        salario);
            }
            file.close(); //cerrar fichero
        }catch (IOException E){
            System.out.println("El ID no existe PAZZO.");
        }
    }
    public static int menu(){
        int opc = 0;

        System.out.println("M E N U:");
        System.out.println("1-. Ingresar datos.");
        System.out.println("2.- Leer datos.");
        System.out.println("0-. Salir.");

        opc = input.nextInt();
        return opc;
    }
}
