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

//Tarea 1.2 (Justificación teórica): Explica en un comentario por qué se produce el error original haciendo referencia a la forma en que Java indexa los arreglos y a la propiedad .length.
//Se produce porque el código intentaba inicializar con el bucle i=lecturas.length, lo cual provocaba que el programa buscara algún índice equivalente al tamaño total del arreglo; por lo que su solución correcta es restar uno para comenzar el recorrido de cada último elemento válido. Esto porque los arreglos en Java dan un esquema de indexación basado en cero, lo que significa que las posiciones válidas de acceso se encuentran siempre en un rango desde 0 hasta length - 1.


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
//Tarea 2.3 (Pregunta conceptual): ¿Cuál es la ventaja de memoria de un Jagged Array sobre una matriz tradicional de N x M cuando los datos de cada fila no son homogéneos? que permite que cada fila interna mantenga una longitud de columnas completamente independiente, lo que permite adaptarse de maner estricta a la cantidad real de datos que almacena.


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

//Tarea 3.3 (Análisis crítico): ¿Qué limitación tiene el bucle for-each en Java respecto a los arreglos tridimensionales si la tarea fuera modificar los valores dentro del arreglo en lugar de solo leerlos? Si se intenta reasignar un nuevo valor a la variable de control dentro del bloque, el cambio solo afectará a dicha variable local temporal, dejando completamente intactos los datos originales almacenados en las posiciones del arreglo tridimensional. 