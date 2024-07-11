package archivos_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        //LECTURA DE UN ARCHIVO TEXTO
        File f;//CONVERTIR EL ARCHIVO FISICO
        FileReader fr;//ABRIR UNA CANALETA DE COMUNICACIÓN(ORIGEN-DESTINO)
        BufferedReader br;//LEER 
        String fila = "";
        int[] n1 = new int[6];
        int[] n2 = new int[6];
        int[] n3 = new int[6];
        int[] n4 = new int[6];

        try {
            f = new File("data/NOTAS.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            int row = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] p = fila.split(";");
                    n1[row] = Integer.parseInt(p[0]);
                    n2[row] = Integer.parseInt(p[1]);
                    n3[row] = Integer.parseInt(p[2]);
                    n4[row] = Integer.parseInt(p[3]);
                    row++;
                }
                i++;
            }
            System.out.printf("%7s %2s %2s %2s %2s %2s","A1","A2","A3","A4","A5","A6");
            System.out.println();
            System.out.println("N1: " + Arrays.toString(n1));
            System.out.println("N2: " + Arrays.toString(n2));
            System.out.println("N3: " + Arrays.toString(n3));
            System.out.println("N4: " + Arrays.toString(n4));
        }catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

}
