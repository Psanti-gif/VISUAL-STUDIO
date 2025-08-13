
import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, sumaP = 0, prom = 0, acumd2 = 0;
        System.out.println("Ingrese la dimensión de la matriz");
        n = sc.nextInt();
        int m[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" - " + m[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                prom = prom + m[i][j];
                if (m[i][j] % 2 == 0) {
                    acumd2 = sumaP = sumaP + m[i][j];
                }
            }
        }
        System.out.println("diagonal superior");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(" - " + m[i][j]);

                }
            }
        }
        System.out.println("el promedio de la matriz es: " + prom);
        System.out.println("La suma de las posiciones pares es " + sumaP);
        System.out.println("La cantidad de números");

    }
}
