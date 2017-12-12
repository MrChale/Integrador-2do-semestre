/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author Ethereos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
            Creedencial vec[] = new Creedencial[50];
            int menu = 0;
            String menu1; 
            String a1;
            int a = 0 ;
            int k = 0;
            int o = 0;
        
            Archivo z = new Archivo("Creedenciales.dat");
            
            do {
                if (z.leer(k)!=null) {
                    vec[k]=z.leer(k);
                    k++;
                }
            } while (z.leer(k)!=null);
        
        
        do{
          
        try
        {
            System.out.println("-------------------------------");
            System.out.println("----Sistema de creedencializacion INE ");
            System.out.println("SE PUEDEN AGREGAR "+ (49 - (k - 1)) + " CREEDENCIALES!!!" );
            System.out.println("1)Agregar una credeencial");
            System.out.println("2)Mostrar todas las creedenciales");
            System.out.println("3)Mostrar la primera creedencial");
            System.out.println("4)Mostrar la siguiente creedencial");
            System.out.println("5)Mostrar la creedencial anterior");
            System.out.println("6)Mostrar la ultima creedencial");
            System.out.println("7)Salir");
        
            System.out.println("----Elije una opcion =");
        
            menu1 = leer.readLine();
            menu = Integer.parseInt(menu1);
          
        if (menu > 7)
        {
            System.out.println("---Volviendo al menu");
            a = 2; 
            menu = 0;
        }
        
        } 
        catch (Exception e) {
            System.out.println("-------------------------------");
            System.out.println("Error!");
            System.out.println("---Volviendo al menu");
            menu = 0;
            a = 2; 
            }
        
        
        switch (menu)
        {
            
        case 1:
        
        do    
        {
        try
        {
        
            String nombre, aPaterno, aMaterno, edad, nacimiento, curp, calle, numero, colonia, estado, municipio, cp, sexo;
            int x = 0;
           
            System.out.println("-------------------------------");
            System.out.println("---Agregando creedencial No." + k );
            System.out.println("SE PUEDEN AGREGAR "+ (49 - (k - 1)) + " CREEDENCIALES!!!" );
            System.out.println("Nombre = ");
            nombre = leer.readLine();
            System.out.println("Apellido Paterno = ");
            aPaterno=leer.readLine();
            System.out.println("Apellido Materno = ");
            aMaterno=leer.readLine();
            System.out.println("Edad = ");
            edad=leer.readLine();
            System.out.println("Año de nacimiento = ");
            nacimiento=leer.readLine();
            System.out.println("CURP = ");
            curp=leer.readLine();
            System.out.println("Calle = ");
            calle=leer.readLine();
            System.out.println("Numero = ");
            numero=leer.readLine();
            System.out.println("Colonia = ");
            colonia=leer.readLine();
            System.out.println("Estado = ");
            estado=leer.readLine();
            System.out.println("Municipio = ");
            municipio=leer.readLine();
            System.out.println("Codigo postal = ");
            cp=leer.readLine();
            System.out.println("Sexo = ");
            sexo=leer.readLine();
            
            
            
            vec[k] = new Creedencial(nombre, aPaterno, aMaterno, edad, nacimiento, curp, calle, numero, colonia, estado, municipio, cp, sexo);
            z.escribir(vec[k]);
            k = k + 1;
            
            
            if ( k > 51 )
            {
                System.out.println("El vector esta lleno!!!");
                a = 2;
                menu = 0;
            }
            
        }catch (Exception e) {
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
            }
            
        
        try
        {
        System.out.println("-------------------------------");
        System.out.println("1)Agregar otra creedencial");
        System.out.println("2)Salir al menu");
        System.out.println("3)Terminar");
        a1 = leer.readLine();
        a = Integer.parseInt(a1);
        
        if (a > 3)
        {
            System.out.println("---Volviendo al menu");
            a = 2;  
            menu = 0;
        }
        
        }catch (Exception e) {
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2;
            }
        
        }while ( a == 1);
        
        break;
        
        case 2:
            
        do
        {
        try
        {
        
            if ( vec[0] == null)
            {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2;
            }
            
            for( int i = 0; i < k; i++)
            {
                if ( vec[i] == null)
            {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2;
                i = k + 1;
            }
//    private String nombre;
//    private String aPaterno;
//    private String aMaterno;
//    private String nacimiento;
//    private String curp;
//    private String calle;
//    private String numero;
//    private String colonia;
//    private String estado;
//    private String municipio;
//    private String cp;
//    private String sexo;

                System.out.println("-------------------------------");
                System.out.println("---Creedencial No." + (i+1) + " de " + (k)+ " creedenciales");
                System.out.println("Nombre = " + vec[i].getNombre());
                System.out.println("Apellido Paterno = "+vec[i].getaPaterno());
                System.out.println("Apelldio Materno = "+vec[i].getaMaterno());
                System.out.println("Edad = "+vec[i].getEdad());
                System.out.println("Fecha de nacimiento = "+vec[i].getNacimiento());
                System.out.println("CURP = "+vec[i].getCurp());
                System.out.println("Calle = "+vec[i].getCalle());
                System.out.println("Numero = "+vec[i].getNumero());
                System.out.println("Colonia = "+vec[i].getColonia());
                System.out.println("Estado = "+vec[i].getEstado());
                System.out.println("Municipio = "+vec[i].getMunicipio());
                System.out.println("Codigo Postal = "+vec[i].getCp());
                System.out.println("Sexo = "+vec[i].getSexo());
            }
            
        }catch (Exception e) {
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
            }
        
        try
        {
        System.out.println("-------------------------------");
        System.out.println("1)Mostrar todas las creedenciales de nuevo");
        System.out.println("2)Salir al menu");
        System.out.println("3)Terminar");
        a1 = leer.readLine();
        a = Integer.parseInt(a1);
        
        if (a > 3)
        {
            System.out.println("---Volviendo al menu");
            a = 2;
            menu = 0;
        }
        
        }catch (Exception e) {
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
            }
        
        } while ( a == 1 );
        
        break;
        
        case 3:
            
            do
            {
                
                if ( vec[0] == null)
            {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2;
            }
            
                if ( vec [0] != null )
                {
                System.out.println("-------------------------------");
                System.out.println("---Primera credencial de " + ( k )+ " creedenciales");
                System.out.println("---Creedencial No." + 0 );
                System.out.println("Nombre = " + vec[0].getNombre());
                System.out.println("Apellido Paterno = "+vec[0].getaPaterno());
                System.out.println("Apelldio Materno = "+vec[0].getaMaterno());
                System.out.println("Edad = "+vec[0].getEdad());
                System.out.println("Fecha de nacimiento = "+vec[0].getNacimiento());
                System.out.println("CURP = "+vec[0].getCurp());
                System.out.println("Calle = "+vec[0].getCalle());
                System.out.println("Numero = "+vec[0].getNumero());
                System.out.println("Colonia = "+vec[0].getColonia());
                System.out.println("Estado = "+vec[0].getEstado());
                System.out.println("Municipio = "+vec[0].getMunicipio());
                System.out.println("Codigo Postal = "+vec[0].getCp());
                System.out.println("Sexo = "+vec[0].getSexo());
                }
                
        try
        {
        System.out.println("-------------------------------");
        System.out.println("1)Mostrar la primera creedencial de nuevo");
        System.out.println("2)Salir al menu");
        System.out.println("3)Terminar");
        a1 = leer.readLine();
        a = Integer.parseInt(a1);
        
        if (a > 3)
        {
            System.out.println("---Volviendo al menu");
            a = 2;
            menu = 0;
        }
        
        }catch (Exception e) {
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
            }
        
            }while ( a == 1 );
            
        break;
        
        case 4:
            
            do
            {
             if (vec[0] == null)
                {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2;
                
                try {
                System.out.println("1)Mostrar la siguiente creedencial");
                System.out.println("2)Salir al menu");
                System.out.println("3)Terminar");
                a1 = leer.readLine();
                a = Integer.parseInt(a1);
        
             if (a > 3)
                {
                System.out.println("---Volviendo al menu");
                a = 2;
                menu = 0;
            
                }
        
                }catch (Exception e) {
                    
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
                
                }
                }
            
                if (vec[0] != null)
                {
                for ( int i = 0 ; i < k; i ++)
                {
                    
                    if (vec[i] == null)
                {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2; 
                i = k + 1;
                }
                    
                System.out.println("-------------------------------");
                System.out.println("---Creedencial No." + (i+1) + " de " + (k) + " creedenciales" );
                System.out.println("Nombre = " + vec[i].getNombre());
                System.out.println("Apellido Paterno = "+vec[i].getaPaterno());
                System.out.println("Apelldio Materno = "+vec[i].getaMaterno());
                System.out.println("Edad = "+vec[i].getEdad());
                System.out.println("Fecha de nacimiento = "+vec[i].getNacimiento());
                System.out.println("CURP = "+vec[i].getCurp());
                System.out.println("Calle = "+vec[i].getCalle());
                System.out.println("Numero = "+vec[i].getNumero());
                System.out.println("Colonia = "+vec[i].getColonia());
                System.out.println("Estado = "+vec[i].getEstado());
                System.out.println("Municipio = "+vec[i].getMunicipio());
                System.out.println("Codigo Postal = "+vec[i].getCp());
                System.out.println("Sexo = "+vec[i].getSexo());
                
                if ( i == (k-1) )
                {
                    System.out.println("-------------------------------");
                    System.out.println("MAXIMO DE REGISTROS!!!");
                    a = 2;
                    menu = 0;
                    i = k + 1;  
                }
                
                try
        {
        System.out.println("-------------------------------");
        System.out.println("1)Mostrar la siguiente creedencial");
        System.out.println("2)Salir al menu");
        System.out.println("3)Terminar");
        a1 = leer.readLine();
        a = Integer.parseInt(a1);
        
        if ( a == 2 || a == 3 )
        {
            i = k + 1;
        }
        
        if (a > 3)
        {
            System.out.println("---Volviendo al menu");
            a = 2;
            menu = 0;
            i = k + 1;
        }
        
        }catch (Exception e) {
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
                i = k + 1;
            }
                }
                } 
                  
            }while ( a == 1 );
            
            break;
            
        case 5:
            
            do
            {
            if (vec[0] == null)
                {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2;
                
                try {
                System.out.println("1)Mostrar la creedencial anterior");
                System.out.println("2)Salir al menu");
                System.out.println("3)Terminar");
                a1 = leer.readLine();
                a = Integer.parseInt(a1);
        
                if (a > 3)
                {
                System.out.println("---Volviendo al menu");
                a = 2;
                menu = 0;
            
                }
        
                }catch (Exception e) {
                    
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
                
                }
                }
            
            if ( vec[0] != null )
            {
                
                for ( int i = 0 ; i < k; i ++)
                {
                    
                    if (vec[i] == null)
                {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2; 
                i = k + 1;
                }
                    
                System.out.println("-------------------------------");
                System.out.println("---Creedencial No." + o + " de " + (k) + " creedenciales" );
                System.out.println("Nombre = " + vec[o].getNombre());
                System.out.println("Apellido Paterno = "+vec[o].getaPaterno());
                System.out.println("Apelldio Materno = "+vec[o].getaMaterno());
                System.out.println("Edad = "+vec[o].getEdad());
                System.out.println("Fecha de nacimiento = "+vec[o].getNacimiento());
                System.out.println("CURP = "+vec[o].getCurp());
                System.out.println("Calle = "+vec[o].getCalle());
                System.out.println("Numero = "+vec[o].getNumero());
                System.out.println("Colonia = "+vec[o].getColonia());
                System.out.println("Estado = "+vec[o].getEstado());
                System.out.println("Municipio = "+vec[o].getMunicipio());
                System.out.println("Codigo Postal = "+vec[o].getCp());
                System.out.println("Sexo = "+vec[o].getSexo());
                
                o = o - 1;
                
                if ( o < 0 )
                {
                    System.out.println("-------------------------------");
                    System.out.println("MINIMO NUMERO DE REGISTROS!!!");
                    o = k - 1;
                    a = 2;
                    menu = 0;
                    i = k + 1;  
                }
                
                try
        {
        System.out.println("-------------------------------");
        System.out.println("1)Mostrar la creedencial anterior");
        System.out.println("2)Salir al menu");
        System.out.println("3)Terminar");
        a1 = leer.readLine();
        a = Integer.parseInt(a1);
        
        if ( a == 2 || a == 3 )
        {
            i = k + 1;
        }
        
        if (a > 3)
        {
            System.out.println("---Volviendo al menu");
            a = 2;
            menu = 0;
            i = k + 1;
        }
        
        }catch (Exception e) {
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
                i = k + 1;
            }
                }
            }
                }while ( a == 1 );
            
            break;
            
        case 6:
            
            do
            {
                
                if (vec[0] == null)
                {
                System.out.println("-------------------------------");
                System.out.println("NO HAY CREEDENCIALES AGREGADAS!!!");
                System.out.println("-------------------------------");
                menu = 0;
                a = 2;
                
                try {
                System.out.println("1)Mostrar la ultima creedencial de nuevo");
                System.out.println("2)Salir al menu");
                System.out.println("3)Terminar");
                a1 = leer.readLine();
                a = Integer.parseInt(a1);
        
                if (a > 3)
                {
                System.out.println("---Volviendo al menu");
                a = 2;
                menu = 0;
            
                }
        
                }catch (Exception e) {
                    
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
                
                }
                }
                
                if ( vec[0] != null )
                {
                    
                System.out.println("-------------------------------");
                System.out.println("---Ultima Creedencial No." + (k-1) + " de " + (k) + " creedenciales" );
                System.out.println("Nombre = " + vec[k-1].getNombre());
                System.out.println("Apellido Paterno = "+vec[k-1].getaPaterno());
                System.out.println("Apelldio Materno = "+vec[k-1].getaMaterno());
                System.out.println("Edad = "+vec[k-1].getEdad());
                System.out.println("Fecha de nacimiento = "+vec[k-1].getNacimiento());
                System.out.println("CURP = "+vec[k-1].getCurp());
                System.out.println("Calle = "+vec[k-1].getCalle());
                System.out.println("Numero = "+vec[k-1].getNumero());
                System.out.println("Colonia = "+vec[k-1].getColonia());
                System.out.println("Estado = "+vec[k-1].getEstado());
                System.out.println("Municipio = "+vec[k-1].getMunicipio());
                System.out.println("Codigo Postal = "+vec[k-1].getCp());
                System.out.println("Sexo = "+vec[k-1].getSexo());
                    
                }
                
                try
        {
        System.out.println("-------------------------------");
        System.out.println("1)Mostrar la ultima creedencial de nuevo");
        System.out.println("2)Salir al menu");
        System.out.println("3)Terminar");
        a1 = leer.readLine();
        a = Integer.parseInt(a1);
        
        if (a > 3)
        {
            System.out.println("---Volviendo al menu");
            a = 2;
            menu = 0;
        }
        
        }catch (Exception e) {
                System.out.println("-------------------------------");
                System.out.println("Error!");
                System.out.println("---Volviendo al menu");
                menu = 0;
                a = 2;
            }
                
            }while ( a == 1 );
            
            break;
            
        case 7:
        
        System.out.println("-------------------------------");
        System.out.println("BYEEE!!!");
        System.out.println("---Programa hecho por el equipor 4 = ");
        System.out.println("Nombre = Roberto Javier Tovar Reyes");
        System.out.println("Nombre = Luis Fernando Verduzco Flores");
        System.out.println("Nombre = Fidel Garcia Barajas");
        System.out.println("Nombre = Carlos Navarro Mendez");
        System.out.println("Facultad = Telematica");
        System.out.println("Carrera = Ingenieria en software");
        System.out.println("Grupo = 2D ");
        System.exit(0);
        
        break;
       
        }
        
        }while( a == 2 );
        
        System.out.println("-------------------------------");
        System.out.println("BYEEE!!!");
        System.out.println("---Programa hecho por el equipor 4 = ");
        System.out.println("Nombre = Roberto Javier Tovar Reyes");
        System.out.println("Nombre = Luis Fernando Verduzco Flores");
        System.out.println("Nombre = Fidel Garcia Barajas");
        System.out.println("Nombre = Carlos Navarro Mendez");
        System.out.println("Facultad = Telematica");
        System.out.println("Carrera = Ingenieria en software");
        System.out.println("Grupo = 2D ");
        System.exit(0);
        
    }
    
}
