package lab1p2_aaroncastillo;

import java.util.Random;
import java.util.Scanner;

public class Lab1P2_AaronCastillo {

    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Ejercicio práctico – Mediana de medianas");
        System.out.println("");
        System.out.print("Ingrese el tamaño deseado para la matriz: ");
        int tam = leer.nextInt();
        if (tam % 2 == 0) {
            System.out.println("Su numero tiene que ser impar y mayor que 4");
        } else if (tam > 4) {
            System.out.println("si");
        } else {
            System.out.println("Su numero tiene que ser impar y mayor que 4");
        }
        int[][] matriz = new int[tam][tam];
        matriz = generar_matriz(tam);
        imprimir_matriz(matriz);
    }

    public static int[][] generar_matriz(int tam) {
        int[][] matriz = new int[tam][tam];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }

    public static void imprimir_matriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

}
