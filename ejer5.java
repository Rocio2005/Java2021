package Javaejercicios.Java2021;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejer5 {
      
    public static void main (String args[]) throws IOException{//metodo para recorrer el archivo empleados.txt
        String path= "C:/Users/acu_r/OneDrive/Escritorio/javainfo/javaejercicios/java2021/empleados.txt";

        try (BufferedReader br= new BufferedReader(new FileReader(path))){
            String line= br.readLine();
            while (line != null){
                System.out.println(line);
                line=br.readLine();
            }
        }
        if ()
    }

}
