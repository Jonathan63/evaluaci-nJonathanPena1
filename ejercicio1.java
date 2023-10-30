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
        
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
            // Ubicar el número en la matriz
            matriz[fila][columna] = numero;


            for (int i = 0; i < 5; i++) {
                matriz[fila][i] = numero + i - columna;
                matriz[i][columna] = numero + i - fila;
            }

            System.out.println("Matriz resultante:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("La ubicación está fuera de los límites de la matriz.");
        }
       
    }
}
