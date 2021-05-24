package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej1 {

    public static void main (String [] args){

        String nombre;

        System.out.println("Por favor,ingrese un nombre");

        Scanner ingresar= new Scanner(System.in);
        
        nombre = ingresar.nextLine();

        ingresar.close();

        System.out.println("¡Hola "+ nombre + "!");
    }
}
