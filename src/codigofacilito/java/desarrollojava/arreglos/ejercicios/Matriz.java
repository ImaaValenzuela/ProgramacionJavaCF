package codigofacilito.java.desarrollojava.arreglos.ejercicios;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100); // Números aleatorios del 0 al 99
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular el promedio de la matriz
        double promedio = calcularPromedio(matriz);
        System.out.println("Promedio de la matriz: " + promedio);

        // Encontrar el número mayor y su frecuencia
        int[] mayorYFrecuencia = encontrarMayorYFrecuencia(matriz);
        System.out.println("Número mayor: " + mayorYFrecuencia[0]);
        System.out.println("Cantidad de veces que se repite: " + mayorYFrecuencia[1]);

        // Mostrar números primos
        System.out.println("Números primos en la matriz:");
        mostrarNumerosPrimos(matriz);

        // Mostrar números pares
        System.out.println("Números pares en la matriz:");
        mostrarNumerosPares(matriz);

        // Sumar las diagonales
        int sumaDiagonales = sumarDiagonales(matriz);
        System.out.println("Suma de las diagonales: " + sumaDiagonales);

        // Sumar la última fila
        int sumaUltimaFila = sumarUltimaFila(matriz);
        System.out.println("Suma de la última fila: " + sumaUltimaFila);

        // Verificar si es un cuadrado mágico
        boolean esCuadradoMagico = esCuadradoMagico(matriz);
        if (esCuadradoMagico) {
            System.out.println("Cuadrado Mágico");
        }
    }

    // Función para calcular el promedio de la matriz
    public static double calcularPromedio(int[][] matriz) {
        double suma = 0;
        int elementos = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                suma += matriz[i][j];
                elementos++;
            }
        }
        return suma / elementos;
    }

    // Función para encontrar el número mayor y su frecuencia
    public static int[] encontrarMayorYFrecuencia(int[][] matriz) {
        int mayor = matriz[0][0];
        int frecuencia = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    frecuencia = 1;
                } else if (matriz[i][j] == mayor) {
                    frecuencia++;
                }
            }
        }
        int[] resultado = { mayor, frecuencia };
        return resultado;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para mostrar números primos en la matriz
    public static void mostrarNumerosPrimos(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // Función para mostrar números pares en la matriz
    public static void mostrarNumerosPares(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // Función para sumar las diagonales de la matriz
    public static int sumarDiagonales(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += matriz[i][i];
            suma += matriz[i][4 - i];
        }
        return suma;
    }

    // Función para sumar la última fila de la matriz
    public static int sumarUltimaFila(int[][] matriz) {
        int suma = 0;
        for (int j = 0; j < 5; j++) {
            suma += matriz[4][j];
        }
        return suma;
    }

    // Función para verificar si la matriz es un cuadrado mágico
    public static boolean esCuadradoMagico(int[][] matriz) {
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonales = sumarDiagonales(matriz);
        int sumaUltimaFila = sumarUltimaFila(matriz);
        
        for (int i = 0; i < 5; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            
            if (sumaFila != sumaUltimaFila || sumaColumna != sumaUltimaFila) {
                return false;
            }
        }
        
        return sumaFila == sumaColumna && sumaFila == sumaUltimaFila && sumaFila == sumaDiagonales;
    }
}

