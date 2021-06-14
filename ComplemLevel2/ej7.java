package Javaejercicios.Java2021.ComplemLevel2;
/*Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4*/

import java.util.ArrayList;
import java.util.Scanner;

public class ej7 {
    public  static void main (String [] args) {
        Scanner ingresar=new Scanner(System.in);
        System.out.println("Por favor ingrese un entero");
        int a=ingresar.nextInt();
        System.out.println("Ingrese otro entero");
        int b=ingresar.nextInt();
        System.out.println(fzzb(a,b));
    }
    public static ArrayList<String> fzzb (int a,int b) {
        ArrayList<String> lista =new ArrayList<String>();
        for (int i=a;i<b;i++) {//pongo i=a para que arranque en a PREGUNTAR SI DEBO USAR WHILE
            if (i%2==0 && i%3!=0) {
                lista.add("FIZZ");
            }
            else if(i%3==0 && i%2!=0) {
                lista.add("BUZZ");
            }
            else if (i%2==0 && i%3==0 ) {
                lista.add("FIZZBUZZ");
            }
            else {
                String s=i+ "";//convierto el indice i a un string
                lista.add(s);
            }
        }
        return lista;
    }
    
}
