package Javaejercicios.Java2021.ComplemLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ej4 {
    public static void main (String [] args) {
        ArrayList <String> nombres =new ArrayList<String>(Arrays.asList("Maria","Juan","Pedro","Antonella","Gaston","Miguel","Anabella","Claudia","German","Macarena","Esteban","Jose","Pedro"));
        List <String> clase1=nombres.subList(0, 4);//para usar subList, necesitaba declarar a la variable clase1 como List, pues con ArrayList no funcionaba
        List <String> clase2=nombres.subList(4, 8);
        List <String> clase3=nombres.subList(8, 12);
        System.out.println("Clase 1: "+clase1+"\n"+"Clase 2: "+clase2+"\n"+"Clase 3: "+clase3);
    
    }
}
