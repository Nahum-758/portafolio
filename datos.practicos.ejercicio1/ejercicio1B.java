public class ejercicio1B {
    public static void main(String[] args) {
        int K = 9; // Último dígito (8) + 1

// FASE 1: Arreglo Unidimensional
        int[] lecturas = {10, -5, 20, K * 2, -1, 30, 0, 15};

        for (int i = lecturas.length - 1; i >= 0; i--) {
            if (lecturas[i] > 0) {
                System.out.println("Lectura positiva: " + lecturas[i]);
            }
        }

// FASE 2: Matriz Irregular (Jagged Array)
        int[][] ventas = new int[3][];
        ventas[0] = new int[K];
        ventas[1] = new int[K + 1];
        ventas[2] = new int[2];

        int sumaTotal = 0;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = (i + 1) * (j + 1);
                sumaTotal += ventas[i][j];
            }
        }

        System.out.println("Suma total de elementos en la matriz irregular: " + sumaTotal);

// FASE 3: Arreglo Tridimensional (Cubo)
        int[][][] cubo = new int[2][K][K];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < K; k++) {
                    cubo[i][j][k] = i + j + k + 1;
                }
            }
        }

        int iIdx = 0;
        for (int[][] matriz2D : cubo) {
            int jIdx = 0;
            for (int[] fila : matriz2D) {
                int kIdx = 0;
                for (int valor : fila) {
                    if (valor % 3 == 0) {
                        System.out.println("Múltiplo encontrado en: " + iIdx + "," + jIdx + "," + kIdx);
                    }
                    kIdx++;
                }
                jIdx++;
            }
            iIdx++;
        }
    }
}