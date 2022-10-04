import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class Empleado implements Serializable {

    private String apellido;
    private int ID;
    private int dpt;
    private double salario;

    public Empleado(int ID) {
        this.ID = ID;
    }

    public Empleado(String apellido, int ID, int dpt, double salario) {
        this.apellido = apellido;
        this.ID = ID;
        this.dpt = dpt;
        this.salario = salario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDpt() {
        return dpt;
    }

    public void setDpt(int dpt) {
        this.dpt = dpt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "apellido='" + apellido + '\'' +
                ", ID=" + ID +
                ", dpt='" + dpt + '\'' +
                ", salario=" + salario +
                '}';
    }
}
