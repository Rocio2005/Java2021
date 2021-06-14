package Javaejercicios.Java2021.ComplemLevel2;


public class Empleado {
    
    String nombre;
    String apellido;
    int dni;
    int ht;// horas trabajadas
    int vxh;//valor por hora

    public Empleado(int dni,String nombre,String apellido,int ht,int vxh)
   {
       this.dni=dni;
       this.nombre=nombre;
       this.apellido=apellido;
       this.ht=ht;
       this.vxh=vxh;

   } 
    @Override
    public String toString() {
        return String.valueOf(this.dni) + 
        "-"+this.nombre + 
        "-"+this.apellido;
    }
    public int getDni() {
        
        return dni;
    }
    public int getSueldo() {
        int sueldo=this.ht*this.vxh;

        return sueldo;
    }

    
}
