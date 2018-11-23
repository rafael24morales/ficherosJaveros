package escribir;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaelm
 */
public class EscribirTextoByteAByte {
    public static void main(String[] args) throws IOException {
        Escribiendo.escribir();
    }
}

class Escribiendo{
    public static void escribir() throws IOException{
        String cadena = "holi";
        FileWriter flwt = new FileWriter("documentonuevo.txt",true);
        for(int i = 0 ; i < cadena.length() ; i++){
            flwt.write(cadena.charAt(i));
        }
        flwt.close();
    }
}
