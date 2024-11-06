package com.mycompany.grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private int numVertices;
    private List<List<Integer>> adyacencia;

    // Constructor que crea el grafo a partir de la matriz
    public Grafo(int[][] matrizAdyacencia) {
        this.numVertices = matrizAdyacencia.length;
        this.adyacencia = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            List<Integer> vecinos = new ArrayList<>();
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdyacencia[i][j] == 1) {
                    vecinos.add(j); // Añadir el nodo j como vecino del nodo i
                }
            }
            adyacencia.add(vecinos);
        }
    }

    // Método para imprimir la lista de adyacencia
    public void imprimirGrafo() {
        for (int i = 0; i < adyacencia.size(); i++) {
            System.out.print("Nodo " + i + " está conectado a: ");
            for (int vecino : adyacencia.get(i)) {
                System.out.print(vecino + " ");
            }
            System.out.println();
        }
    }
}
