package complejidades;

public class ComplejidadLineal {
    
    // O(n) - Recorre el array una sola vez
    public int sumarElementos(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
}
