package Javaejercicios.Java2021.ComplemLevel2;
import java.util.HashMap;
import java.util.HashSet;
/*6. Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.*/
import java.util.Set;

public class ej6 {
    public static void main(String [] args) {
        Empleado emp1=new Empleado(13556, "Juan", "Perez", 20, 100);
        System.out.println(emp1.toString());
        Empleado emp2=new Empleado(1234,"Mario","Amas",10,110);
        Empleado emp3=new Empleado(34431,"Maria","Astuta",15,105);
        Empleado emp4=new Empleado(23095,"Ana","Artista",20,110);
        Empleado emp5=new Empleado(445342,"Esteban","Solitario",15,100);

        Set <Empleado> empleados =new HashSet<Empleado>();//dentro de <> va el nombre de la clase que quiero almacenar
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);
        System.out.println(emp1.getDni());
        for (Empleado emp:empleados){ //acceder a los objetos de la clase empleado del set empleados
            emp.getSueldo();
            System.out.println(emp.getSueldo());
        }

        HashMap <Integer,Integer> sueldos =new HashMap<>();//creo que el mapa para guardar la clave valor,poner qué tipo de dato es cada uno
        
        for (Empleado emp:empleados){
            sueldos.put(emp.getDni(),emp.getSueldo());//añado en el diccionario cada empleado con su dni y sueldo al map sueldos
        }
        System.out.println(sueldos);


    }

    
}
