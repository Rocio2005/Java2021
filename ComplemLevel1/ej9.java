package Javaejercicios.Java2021.ComplemLevel1;
import java.util.*;

public class ej9 {
    public static void main(String[] args) {
        String word;
        String l;
        Scanner ingresar=new Scanner(System.in);
        System.out.println("Ingresa la palabra o frase");
        word=ingresar.nextLine();
        System.out.println("La palabra o frase ingresada es:"+word);
        System.out.println("Ingrese la letra que desea contar");
        l= ingresar.nextLine();
        ingresar.close();
        System.out.println("La letra "+l+" se repite "+contador(word,l.charAt(0))+" veces en la frase");
        
    }
    //uso de funciones 
    public static int contador (String frase,char letra){
        int c=0;
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==letra) {
                c=c+1;
            }
        }
        return c;

    }
}
