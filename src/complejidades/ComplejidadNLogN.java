package complejidades;

public class ComplejidadNLogN {
    
    // O(n log n) - Merge Sort
    public int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        
        int medio = array.length / 2;
        int[] izquierda = new int[medio];
        int[] derecha = new int[array.length - medio];
        
        System.arraycopy(array, 0, izquierda, 0, medio);
        System.arraycopy(array, medio, derecha, 0, array.length - medio);
        
        return fusionar(mergeSort(izquierda), mergeSort(derecha));
    }
    
    private int[] fusionar(int[] izquierda, int[] derecha) {
        int[] resultado = new int[izquierda.length + derecha.length];
        int i = 0, j = 0, k = 0;
        
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                resultado[k++] = izquierda[i++];
            } else {
                resultado[k++] = derecha[j++];
            }
        }
        
        while (i < izquierda.length) {
            resultado[k++] = izquierda[i++];
        }
        
        while (j < derecha.length) {
            resultado[k++] = derecha[j++];
        }
        
        return resultado;
    }
}
