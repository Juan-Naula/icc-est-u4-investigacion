package complejidades;

public class ComplejidadCuadratica {
    
    // O(n²) - Bubble Sort
    public int[] bubbleSort(int[] array) {
        int[] resultado = array.clone();
        
        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - i - 1; j++) {
                if (resultado[j] > resultado[j + 1]) {
                    int temp = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temp;
                }
            }
        }
        
        return resultado;
    }
}
