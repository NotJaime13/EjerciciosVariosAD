import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader f1 = new FileReader("C:\\Users\\jaime\\Desktop\\Clase\\ADatos\\Miau.txt");
        int num = f1.read();
        while(num != -1){
            System.out.print((char)num);
            num = f1.read();
        }
        f1.close();
    }
}