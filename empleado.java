package Javaejercicios.Java2021;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class empleado {
    
        String nombre;
        String apellido;
        LocalDate fecnac;
        float sueldo;
    
        public empleado(String nombre,String apellido,String fecnac,String sueldo)//porqué se pasa todo a string??
       {
           this.nombre=nombre;
           this.apellido=apellido;
           this.fecnac = LocalDate.parse(fecnac, DateTimeFormatter.ofPattern("dd-MM-yyyy"));//parse:Con este método, 
           //convertimos una cadena de caracteres, un String, en un dato numérico
           this.sueldo=Float.parseFloat(sueldo);
    
       } 
        @Override
        public String toString() {
            return String.valueOf (this.nombre + //String.valueOf() se usa para obtener la representación String de un valor u objeto
            "-"+this.apellido+"-"+this.fecnac+"-"+this.sueldo);
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public String getApellido() {
            return apellido;
        }

        public void setFechaNac(String birth) {
            this.fecnac= LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        public LocalDate getFechaNac() {
            return fecnac;
        }

        public void setSueldo(float sueldo) {
            this.sueldo = sueldo;
        }
        public float getSueldo() {
            return sueldo;
        }

    
        
    
    
}