package Javaejercicios.Java2021.ComplemLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ej3 {
    public static void main(String [] args) {
        ArrayList <Integer> ramo =new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9,10));//Array.asList para ingresar datos de una y no usar .add
        
        System.out.println(ramo);
        Collections.reverse(ramo);
        System.out.println(ramo);
        Collections.shuffle(ramo);//.shuffle sirve para desordenar los elementos de la lista.Tambien dice que se puede hacer usando Random(ver despues)
        System.out.println(ramo);
        
        
        
    }
   
    

/*public static ArrayList<Integer> reverso (ArrayList<Integer> lis1,ArrayList<Integer> lis2) {
    lis2=Collections.reverse(lis1);
}*/
}