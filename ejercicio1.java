import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear una matriz 5x5
        int[][] matriz = new int[5][5];

        // Ingresar un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Ingresar la ubicación
        System.out.print("Ingrese la fila (0-4): ");
        int fila = scanner.nextInt();
        System.out.print("Ingrese la columna (0-4): ");
        int columna = scanner.nextInt();

       
    }
}
