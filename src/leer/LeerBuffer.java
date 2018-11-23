/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rafaelm
 */
public class LeerBuffer {
    public static void main(String[] args) throws IOException {
        LeerFicheroConBuffer.leer();
    }  
}

class LeerFicheroConBuffer{
    public static void leer() throws FileNotFoundException, IOException{
        FileReader flrd = new FileReader("documentonuevo.txt");
        BufferedReader elbuffer = new BufferedReader(flrd);
        
        String linea = "";
        
        while(linea != null){
            linea = elbuffer.readLine();
            if(linea!=null)
                System.out.print(linea);
        }
        elbuffer.close();
        flrd.close();
    }
}