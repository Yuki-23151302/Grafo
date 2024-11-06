package com.mycompany.grafo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño de la matriz de adyacencia
        System.out.print("Ingrese la cantidad de nodos en el grafo: ");
        int numVertices = scanner.nextInt();

        // Crear la matriz de adyacencia con el tamaño 
        int[][] matrizAdyacencia = new int[numVertices][numVertices];

        // Rellenar la matriz
        System.out.println("Ingrese los valores de la matriz de adyacencia (0 o 1):");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print("¿Existe una arista entre el nodo " + i + " y el nodo " + j + "? (0 = No, 1 = Sí): ");
                matrizAdyacencia[i][j] = scanner.nextInt();
            }
        }

        // Crear el grafo a partir de la matriz de adyacencia ingresada
        Grafo grafo = new Grafo(matrizAdyacencia);

        // Imprimir el grafo
        System.out.println("\nLista de adyacencia del grafo:");
        grafo.imprimirGrafo();

        scanner.close();
    }
}
