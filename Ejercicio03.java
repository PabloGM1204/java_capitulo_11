import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03{
    public static void main(String[] args) {
        try {
            // Creamos el archivo donde mezclamos todo
            BufferedWriter bw = new BufferedWriter(new FileWriter("mix.dat"));
            // Lee el primer archivo
            BufferedReader br1 = new BufferedReader(new FileReader("asdfasdfas.txt"));
            // Leer el segundo archivo
            BufferedReader br2 = new BufferedReader(new FileReader("hola.txt"));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 != null) || (linea2 != null)) {
                if(linea1 != null){
                    linea1 = br1.readLine();
                    bw.write(linea1+"\n");
                }
                if(linea2 != null){
                    linea2 = br2.readLine();
                    bw.write(linea2+"\n");
                }
            }

            bw.close();
            br1.close();
            br2.close();

        } catch (IOException e) {
            System.out.println("No se ha podido crear el fichero");
        }
    }
}