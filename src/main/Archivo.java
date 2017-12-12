/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ethereos
 */
public class Archivo {
    
    private RandomAccessFile g;
    
    public Archivo (String nombre)
    {
        try {
            g = new RandomAccessFile(nombre, "rw");
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR : " + ex.getMessage());
        }
    }
    
    public void escribir(Creedencial creedencial)
    {
        try {
            g.seek(g.length());
            g.writeChars(creedencial.getNombreAjustado());
            g.writeChars(creedencial.getaPaternoAjustado());
            g.writeChars(creedencial.getaMaternoAjustado());
            g.writeChars(creedencial.getEdadAjustado());
            g.writeChars(creedencial.getNacimientoAjustado());
            g.writeChars(creedencial.getCurpAjustado());
            g.writeChars(creedencial.getCalleAjustado());
            g.writeChars(creedencial.getNumeroAjustado());
            g.writeChars(creedencial.getColoniaAjustado());
            g.writeChars(creedencial.getEstadoAjustado());
            g.writeChars(creedencial.getMunicipioAjustado());
            g.writeChars(creedencial.getCpAjustado());
            g.writeChars(creedencial.getSexoAjustado());
            
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Creedencial leer(int num)
    {
        try
        {
        int pos = (num) * 516;
        
        if(pos > g.length())
        return null;
        
        g.seek(pos);
        
        Creedencial x = leer();
        return x;
        
        }catch (IOException ex) {
            return null;
        }
        
    }
    
    public Creedencial leer()
    {
        try {
            //AQUI
            char cNombre[] = new char[20];
            char cPaterno[] = new char[20];
            char cMaterno[] = new char[20];
            char cEdad[]=new char[20];
            char cNacimiento[] = new char[20];
            char cCurp[] = new char[18];
            char cCalle[] = new char[20];
            char cNumero[] = new char[20];
            char cColonia[] = new char[20];
            char cEstado[] = new char[20];
            char cMunicipio[] = new char[20];
            char cCp[] = new char[20];
            char cSexo[] = new char[20];

            String nombre, aPaterno, aMaterno, edad, nacimiento, curp, calle, numero, colonia, estado, municipio, cp, sexo;
            
            for(int i = 0; i < cNombre.length; i++)
            {
                cNombre[i] = g.readChar();
            }
            
            for(int i = 0; i < cPaterno.length; i++)
            {
                cPaterno[i] = g.readChar();
            }
            
            for(int i = 0; i < cMaterno.length; i++)
            {
                cMaterno[i] = g.readChar();
            }
            
            for(int i = 0; i < cEdad.length; i++)
            {
                cEdad[i] = g.readChar();
            }
            
            for(int i = 0; i < cNacimiento.length; i++)
            {
                cNacimiento[i] = g.readChar();
            }
            
            for(int i = 0; i < cCurp.length; i++)
            {
                cCurp[i] = g.readChar();
            }
            
            for(int i = 0; i < cCalle.length; i++)
            {
                cCalle[i] = g.readChar();
            }
            
            for(int i = 0; i < cNumero.length; i++)
            {
                cNumero[i] = g.readChar();
            }
            
            for(int i = 0; i < cColonia.length; i++)
            {
                cColonia[i] = g.readChar();
            }
            
            for(int i = 0; i < cEstado.length; i++)
            {
                cEstado[i] = g.readChar();
            }
            
            for(int i = 0; i < cMunicipio.length; i++)
            {
                cMunicipio[i] = g.readChar();
            }
            
            for(int i = 0; i < cCp.length; i++)
            {
                cCp[i] = g.readChar();
            }
            
            for(int i = 0; i < cSexo.length; i++)
            {
                cSexo[i] = g.readChar();
            }
            
            nombre = new String(cNombre);
            aPaterno = new String(cPaterno);
            aMaterno = new String(cMaterno);
            edad=new String(cEdad);
            nacimiento = new String(cNacimiento);
            curp = new String(cCurp);
            calle= new String(cCalle);
            numero= new String(cNumero);
            colonia= new String(cColonia);
            estado= new String(cEstado);
            municipio= new String(cMunicipio);
            cp= new String(cCp);
            sexo= new String(cSexo);
            
            Creedencial c = new Creedencial(nombre, aPaterno, aMaterno, edad, nacimiento, curp, calle, numero, colonia, estado, municipio, cp, sexo);
            
            return c;
            
        } catch (IOException ex) {
            return null;
        }
    }
}
