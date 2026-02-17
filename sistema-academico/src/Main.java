import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double notas [ ] = new double[10];

       // Asignar valores a cada posicion
       for (int i=0; i< notas.length; i++) {

           System.out.println("Ingresar la nota del estudiante" + i);

           notas[i] = sc.nextDouble();

        }
    }
}