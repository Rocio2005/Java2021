package Javaejercicios.Java2021;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class ejer5 {
      
    public static void main (String args[]) throws IOException{//metodo para recorrer el archivo empleados.txt
        String path= "C:/Users/acu_r/OneDrive/Escritorio/javainfo/javaejercicios/java2021/empleados.txt";

        try (BufferedReader br= new BufferedReader(new FileReader(path))){
            String line= br.readLine();
            while (line != null){
                System.out.println(line);
                line=br.readLine();
            }
        }

        //Busco los empleados cuya primer letra del apellido coincide con la ingresada
        System.out.println("Los empleados de la empresa son: "+CargarEmpleado());
        System.out.println("**************************************************************************");
        System.out.println("Ingresa la primer letra del apellido que desea buscar");
        Scanner ingresa=new Scanner(System.in);
        String l=ingresa.nextLine();
        char m=l.charAt(0);//creo una variable tipo char para guardar la letra y poder usar el metodo para pasarlo a mayusculas
        m=Character.toUpperCase(m); //uso el método por si el usuario ingreso la letra en minuscula
        System.out.println("Los apellidos con la letra "+m+" son: "+ busapell(m,CargarEmpleado()));
        System.out.println("**************************************************************************");

        //creo mapa con las edades y los apellidos de los empleados:
        HashMap <String,Integer> edades =new HashMap<>();
        for (empleado emp:CargarEmpleado()){//calculo la edad de cada empleado
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaNacimiento = LocalDate.parse(emp.getFechaNac().toString(), formatter);
            Period edad = Period.between(fechaNacimiento, LocalDate.now());
            edades.put(emp.getApellido(),edad.getYears());//agrego cada empleado con su edad
        }
        
        //método para imprimir el empleado de mayor edad y del menor edad:
        int a=Collections.max(edades.values()) ;
        int b=Collections.min(edades.values());
        for (HashMap.Entry<String, Integer> entrada : edades.entrySet()) {
            if (a==entrada.getValue()){
                System.out.println("El apellido del empleado de mayor edad es: "+entrada.getKey());
            }
            if(b==entrada.getValue()){
                System.out.println("El apellido del empleado de menor edad es: "+entrada.getKey());
            }
        }
        System.out.println("**************************************************************************");

        //método para -El empleado que más gana y el que menos gana.
        HashMap<String,Float> salarios=new HashMap<>();
        for(empleado emp:CargarEmpleado()){
            salarios.put(emp.getApellido(), emp.getSueldo());
        }
        float c=Collections.max(salarios.values());
        float d=Collections.min(salarios.values());
        for (HashMap.Entry<String, Float> entry : salarios.entrySet()) {
            if (c==entry.getValue()){
                System.out.println("El apellido del empleado de mayor sueldo es: "+entry.getKey());
            }
            if(d==entry.getValue()){
                System.out.println("El apellido del empleado de menor sueldo es: "+entry.getKey());
            }
        }


  
    }
                            
    //recorro cada linea, leyendo cada elemento separado por comas, luego lo cargo a una lista
    public static List<empleado> CargarEmpleado() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String[] empl;
        List<empleado> listaemple = new ArrayList<>();

        try {
            file = new File("C:/Users/acu_r/OneDrive/Escritorio/javainfo/javaejercicios/java2021/empleados.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {//mientras la linea no este vacía
                empl = line.split(",");//lee cada elemento separado por coma en la linea
                listaemple.add(new empleado(empl[0], empl[1], empl[2], empl[3]));//agrega cada elemento de la linea como un unico elemento de la lista
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileReader)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return listaemple;
        
    }

    //-Método que devuelva todos los empleados que comienzan con una letra dada en el apellido
    public static List <String> busapell(char m,List<empleado> listaemple) {
        List<String> ape_con_i =new ArrayList<String>();
        for (empleado emp:listaemple){
            char i=emp.getApellido().charAt(0);
            if (m==i) {
                ape_con_i.add(emp.getApellido());
            }
        
        }
        return ape_con_i;

    }

    

   

    

}
