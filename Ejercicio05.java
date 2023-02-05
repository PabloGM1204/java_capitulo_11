import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio05{
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Uso del programa: S11Ejercicio05 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
            System.exit(-1);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
            String lineaOrig = br.readLine();
            String lineaDest = "";
            int i = 0;

            while (lineaOrig != null) {
                lineaOrig = br.readLine();
                if((i = lineaOrig.indexOf("//")) != -1){
                    lineaDest = lineaOrig.substring(0, i);
                }
                bw.write(lineaDest + "\n");
            }

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }catch(IOException i){
            System.out.println("No se pudo escribir en el archivo");
        }
    }
}