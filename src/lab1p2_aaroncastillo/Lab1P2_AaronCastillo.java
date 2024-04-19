package lab1p2_aaroncastillo;
//fila 2, asiento 7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab1P2_AaronCastillo {

    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Integer> mediana = new ArrayList();

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
        System.out.println("Matriz ordenada:");
        ordenamiento_filas(0, matriz);
        System.out.println("Arreglo de medianas: ");
        calculo_mediana(matriz);
        for (int i = 0; i < mediana.size(); i++) {
            System.out.print("[" + mediana.get(i) + "]");
        }
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

    public static void ordenamiento_filas(int i, int matriz[][]) {
        if (i >= matriz.length) {
            System.out.println();
        } else {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz[j].length; k++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println();
            }
            ordenamiento_filas(i, matriz);
        }
    }

    public static ArrayList calculo_mediana(int matriz[][]) {
        int mediana_ = matriz.length;
        int medio = mediana_ / 2;
        System.out.println(medio);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[j] == matriz[medio]) {
                    mediana.add(matriz[i][j]);
                }
            }
        }
        return mediana;
    }
}
