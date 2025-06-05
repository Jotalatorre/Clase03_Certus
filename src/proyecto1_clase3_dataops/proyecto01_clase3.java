package proyecto1_clase3_dataops;

//@author Jorge Latorre
import java.util.Scanner;

public class Proyecto01_Clase3 {
    public static void main(String[] args) {
        // declarar variables
        double num1, num2, suma, promedio;
        Scanner lectura = new Scanner(System.in);

        // entrada datos
        System.out.print("Ingresar numero 1: ");
        num1 = lectura.nextDouble();
        System.out.print("Ingresar numero 2: ");
        num2 = lectura.nextDouble();

        // procesamiento
        suma = num1 + num2;
        promedio = suma / 2;

        // salida de datos
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        lectura.close();
    }
}
