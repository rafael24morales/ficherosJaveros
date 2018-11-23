/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rafaelm
 */
public class LeerFichero {
    public static void main(String[] args) throws IOException {
        FicheroByteAByte.ler();
    }
}

class FicheroByteAByte{
    public static void ler() throws IOException{
        FileReader flrd = null;
        try{
            flrd = new FileReader("documentonuevo.txt");
            int a = 0;
            while(a != -1){
                a = flrd.read();
                char letra = (char) a;
                System.out.print(letra);
            }
        }catch(IOException ioe){
            System.out.println("OMG! LO ATRAPÓ " + 
                    "\nno encontró el doc");
        }finally{
            flrd.close();
        }
    }
}
