package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej6 {
    public static void main (String [] args){
        System.out.println("-----Potenciación-----");
        int a;
        int b;
        Scanner ingresar =new Scanner(System.in);
        System.out.println("Ingrese la base");
        a=ingresar.nextInt();
        System.out.println("Ingrese el exponente");
        b=ingresar.nextInt();
        int potencia=1;
        for (int i=1;i<=b;i++){
            potencia= potencia*a;
        }
        System.out.println("El resultado de la potenciación es "+potencia);
        ingresar.close();
    }
    
}
