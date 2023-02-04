package Ejercicio04;

import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio04{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        int l = args[0].length();
        String nom = args[0].substring(0, l-4);
        String ext = args[0].substring(l-4, l);
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            // "./Ejercicio04/"
            BufferedWriter bw = new BufferedWriter(new FileWriter(nom+"_sort"+ext));
            String linea = br.readLine();

            while (linea != null) {
                list.add(linea);
                linea = br.readLine();
            }

            Collections.sort(list);

            for (String s : list) {
                bw.write(s+"\n");
            }

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch(IOException i){
            System.out.println("No se puede escribir en el fichero");
        }
    }
}