package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej4 {
    public static void main (String [] args){
        System.out.println("------FACTORIAL DE UN NÚMERO------");
        int a;
        int factorial=1;
        Scanner ingresa= new Scanner(System.in);
        System.out.println("Por favor, ingrese un número");
        a=ingresa.nextInt();
        for (int i=0;i<a;i++) {
            
            factorial=factorial*(a-i);

        }
        System.out.println("El factorial de "+a+" es "+factorial);
        ingresa.close();
        

    }
    
}
