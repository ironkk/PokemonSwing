package Utilidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/*
 * Clase estándard para guardar/leer javabeans en fichero
 */
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mfontana
 */
public class Fichero {
    
    // Variable para guardar el nombre del fichero
    private String nombre;

    // Inicializamos el nombre del fichero 
    public Fichero(String nombre) {
        this.nombre = nombre;
    }
    
    // Función para guardar datos en un fichero (XML)
    public void grabar(Object o) {
        try {
            // Creamos el codificador
            XMLEncoder codificador = new XMLEncoder(new FileOutputStream(new File(nombre)));
            // Escribimos el objeto que nos pasan en el fichero (en XML).
            codificador.writeObject(o);
            codificador.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Función para leer datos de un fichero (XML)
    public Object leer() {
        try {
            // Creamos el decodificador
            XMLDecoder decodificador = new XMLDecoder(new FileInputStream(new File(nombre)));
            // Leemos el objeto del fichero (XML)
            return decodificador.readObject();
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
}
