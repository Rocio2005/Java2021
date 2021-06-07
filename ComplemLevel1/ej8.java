package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej8 {
    public static void main(String [] args) {

    String NomyApe;
    String direccion;
    int edad;
    String Ciudad;
    Scanner ingresar=new Scanner (System.in);
    System.out.println("Por favor ingrese el nombre y apellido de la persona");
    NomyApe=ingresar.nextLine();
    System.out.println("Por favor ingrese la dirección de la persona");
    direccion=ingresar.nextLine();
    System.out.println("Por favor ingrese la edad de la persona");
    edad=ingresar.nextInt(); 
    ingresar.nextLine();//para que el scan funcione
    System.out.println("Por favor ingrese la ciudad");
    Ciudad=ingresar.nextLine();
    
    System.out.println(Ciudad+" - "+direccion+" - "+edad+" - "+NomyApe);
    ingresar.close();
    }
    
}
