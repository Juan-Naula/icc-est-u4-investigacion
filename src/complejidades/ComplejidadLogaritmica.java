package complejidades;

public class ComplejidadLogaritmica {
    
    // O(log n) - Búsqueda binaria en array ordenado
    public int busquedaBinaria(int[] array, int objetivo) {
        int izquierda = 0, derecha = array.length - 1;
        
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            
            if (array[medio] == objetivo) {
                return medio;
            } else if (array[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1;
    }
}
