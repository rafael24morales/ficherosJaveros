/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author rafaelm
 */
public class SerializablePrincial {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Serializables.escribir();
    }
    
}

class Serializables {
    public static void escribir() throws FileNotFoundException, IOException, ClassNotFoundException{
           Caballo caballito = new Caballo("ballo","morado","Pura sangre");
        
            FileOutputStream file = new FileOutputStream("Serializables.txt");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(caballito);
            oos.close();
            file.close();
            
            FileInputStream fist = new FileInputStream("Serializables.txt");
            ObjectInputStream ois = new ObjectInputStream(fist);
            
            Caballo caballon = (Caballo) ois.readObject();
            System.out.println(caballon.getNombre());
    }
}
