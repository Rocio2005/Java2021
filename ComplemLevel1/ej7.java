package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej7 {
    public static void main (String [] args){
        System.out.println("-----String-----");
        String b;
        Scanner ingresar =new Scanner(System.in);
        System.out.println("Ingrese el String");
        b=ingresar.nextLine();
        ingresar.close();
        for (int i=0;i<b.length();i++) {
            System.out.print(aMayu(b.charAt(i))); //metodo charAt acceder al caracter de la posicion i del string b//

        }
        //System.out.println(aMayu('o')) para indicar caracter uso ''
    }
    //use el metodo amayu de un compañero,qué significa letra-'a'+'A'?
    public static char aMayu(char letra){
        char mayuLetra=(char) (letra-'a'+'A');
        return mayuLetra;
    }
    
        
    

    
}
