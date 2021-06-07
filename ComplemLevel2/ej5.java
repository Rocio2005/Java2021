package Javaejercicios.Java2021.ComplemLevel2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/* ejercicio 5: Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.*/
import java.util.List;

public class ej5 {
    public static void main(String[] args) {
        List<Integer> ht = new ArrayList<Integer>(5);// ht=horas trabajadas
        List<Integer> vh = new ArrayList<Integer>(5);// vh=valor hora
        System.out.println("Ingrese las horas trabajadas en el día en orden de lunes a viernes: ");
        System.out.println("HORAS TRABAJADAS" + carLis(ht));
        System.out.println("Ingrese el valor por hora en cada dia de la semana");
        System.out.println("Valor por hora" + carLis(vh));
        System.out.println("Los totales por semana quedaría: "+totxDia(ht, vh));
        System.out.println("El importe a cobrar en la semana es: "+"$ "+sueldo(totxDia(ht,vh)));

    }

    // creé una funcion para cargar listas
    public static List<Integer> carLis(List<Integer> lista) {

        Scanner ingresa = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {// puse i<5 porque con i<lista.size no iteraba,pues al pricpio la lista esta
                                     // vacía.
            int elem = ingresa.nextInt();
            lista.add(elem);

        }
        return lista;
    }
    // creé una función para hacer el producto escalar entre dos listas.Elemento a elemento
    public static List<Integer> totxDia (List<Integer> lis1,List <Integer> lis2) {
        List<Integer> total = new ArrayList<Integer>();
        for (int i=0;i<lis1.size();i++) {
            int elem=lis1.get(i)*lis2.get(i);
            total.add(elem);
        }
        return total;
    }
    // creo una función para sumar los elementos de una lista
    public static int sueldo(List <Integer> lista){
        int c=0;
        for(int j=0;j<lista.size();j++){
            c=c+lista.get(j);
        }
        return c;
    }
    
    
}
