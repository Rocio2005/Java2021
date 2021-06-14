package Javaejercicios.Java2021;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class empleado {
    
        String nombre;
        String apellido;
        LocalDate fecnac;
        float sueldo;
    
        public empleado(String nombre,String apellido,LocalDate fecnac,float sueldo)
       {
           this.nombre=nombre;
           this.apellido=apellido;
           this.fecnac=fecnac;
           this.sueldo=sueldo;
    
       } 
        /*@Override
        public String toString() {
            return String.valueOf "-"+this.nombre + 
            "-"+this.apellido;
        }*/
        public String getNombre() {
            
            return nombre;
        }

        public String getApellido() {

            return apellido;
        }
        
        public float getSueldo() {
    
            return sueldo;
        }

    
        
    
    
}