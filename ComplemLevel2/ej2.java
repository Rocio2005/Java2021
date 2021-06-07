package Javaejercicios.Java2021.ComplemLevel2;
import java.util.Scanner;
import java.util.ArrayList;

public class ej2 {
    public static void main(String [] args){
        Scanner ingresar=new Scanner(System.in);
        ArrayList<Integer> enteros=new ArrayList<Integer>();
        ArrayList<Integer> enteros2=new ArrayList<Integer>(enteros);
    
        enteros.add(1);
        enteros.add(6);
        enteros.add(3);
        enteros.add(5);
        enteros.add(8);
        copList(enteros, enteros2);
        System.out.println("ingrese un número entero");
        int c=ingresar.nextInt();
        enteros2.add(0, c);
        System.out.println("ingrese otro número entero");
        int d=ingresar.nextInt();
        enteros2.add(d);
        System.out.println(enteros+" "+enteros.size()+" elementos");
        System.out.println(enteros2+" "+enteros2.size()+" elementos");
        ingresar.close();
    }
    //creo una función para que copie la lista, y que al modificar la copia no me modifique la lista original
    public static ArrayList<Integer> copList(ArrayList<Integer> list,ArrayList<Integer>listCop){
        for(int i=0;i<list.size();i++){
            listCop.add(list.get(i));

        }
        return listCop;

    }
}
