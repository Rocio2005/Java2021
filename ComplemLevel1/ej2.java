package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej2 {
    public static void main (String [] args){
        int num1;
        int num2;
        int resta;
        int suma;
        Scanner input= new Scanner (System.in);
        System.out.println("Ingrese un número entero");
        num1=input.nextInt();
        System.out.println("Ingrese un número entero");
        num2=input.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        System.out.println("El resultado de la adición es "+num1+ " + " +num2+ " = "+ suma);
        System.out.println("El resultado de la sustracción es "+num1+ " - " +num2+ " = "+ resta);
        System.out.println("El cociente de la división es " +num1+ " : " +num2+ " = "+ num1/num2);
        System.out.println("El resto de la división es "+num1+ " % " +num2+ " = "+ num1%num2);
        System.out.println("El resultado de la multiplicación es "+num1+ " x " +num2+ " = "+ num1*num2);

        input.close();



    };
}
