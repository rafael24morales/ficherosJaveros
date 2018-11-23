package escribir;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaelm
 */
public class EscribiendoTextoBuffer {
    public static void main(String[] args) throws IOException {
        EscribiendoBuffer.escribir();
    }
}


class EscribiendoBuffer{
    public static void escribir() throws IOException{
        String[] arreglo = {"escribiendo","ando","con","buffer"};
       
        try (FileWriter flwt = new FileWriter("documentobuffer.txt",true)) {
            BufferedWriter escribir = new BufferedWriter(flwt);
            PrintWriter escribirImpl = new PrintWriter(escribir);
            
            for(int i = 0; i < arreglo.length ; i++){
                escribirImpl.println(i+1 + " " + arreglo[i]);
            }
            escribirImpl.close();
            escribir.close();
        }
    }
}
