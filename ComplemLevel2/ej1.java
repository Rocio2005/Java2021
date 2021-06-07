package Javaejercicios.Java2021.ComplemLevel2;
import java.util.ArrayList;
import java.util.Scanner;
public class ej1 {
    public static void main (String [] args){
        ArrayList<String> ciudades =new ArrayList<String>();
        String elem;
        int c=0;
        Scanner ingresar=new Scanner(System.in);
        while (c==0) {
            System.out.println("Ingrese su ciudad preferida");
            elem=ingresar.nextLine();
            ciudades.add(elem);
            System.out.println("Ingrese 0 para continuar cargando ciudades, si quiere salir presione cualquier otro entero");
            c=ingresar.nextInt();
            ingresar.nextLine();//agregué esto porque en la proxima iteracion del while no funcionaba el scanner

        }
        ingresar.close();
        for (int i=0;i<ciudades.size();i++) {     //.size para saber el tamaño del array
            System.out.println("#"+(i+1)+" "+ciudades.get(i)); //.get(i) para saber el string que esta en la posicion i
        }
    
    }
    
}