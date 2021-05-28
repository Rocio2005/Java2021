package Javaejercicios.Java2021.ComplemLevel1;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        int ent;
        
        Scanner input= new Scanner(System.in);

        System.out.println("Ingrese un número");

        ent=input.nextInt();

        input.close();
        
        for (int i=1;i<=ent;i++) {
            for (int j=1;j<=i;j++){
                System.out.print(i-(i-j)+"\t");
            }
            System.out.print("\n");
        }
        
    }
    
}
