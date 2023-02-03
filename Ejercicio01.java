import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01{
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            for(int i = 1; i<500; i++){
                if(esPrimo(i)){
                    bw.write(String.valueOf(i)+"\n");
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }

    public static boolean esPrimo(int i){
        for(int j = 2; j<=i/2; j++){
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }
}