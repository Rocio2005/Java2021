package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej5 {
    public static void main (String [] args){
        System.out.println("-----Multiplicación-----");
        int a;
        int b;
        Scanner ingresar =new Scanner(System.in);
        System.out.println("Ingrese el primer factor");
        a=ingresar.nextInt();
        System.out.println("Ingrese el segundo factor");
        b=ingresar.nextInt();
        int producto=0;
        for (int i=1;i<=b;i++){
            producto= producto+a;
        }
        System.out.println("El resultado de la multiplicación es "+producto);
        ingresar.close();
    }

}
