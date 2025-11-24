import complejidades.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {5, 2, 8, 1, 9, 3};
        int[] numerosOrdenados = {1, 2, 3, 5, 8, 9};
        
        // O(1) - Complejidad Constante
        ComplejidadConstante constante = new ComplejidadConstante();
        System.out.println("O(1) - Primer elemento: " + constante.obtenerPrimerElemento(numeros));
        
        // O(n) - Complejidad Lineal
        ComplejidadLineal lineal = new ComplejidadLineal();
        System.out.println("O(n) - Suma de elementos: " + lineal.sumarElementos(numeros));
        
        // O(log n) - Complejidad Logarítmica
        ComplejidadLogaritmica logaritmica = new ComplejidadLogaritmica();
        int posicion = logaritmica.busquedaBinaria(numerosOrdenados, 5);
        System.out.println("O(log n) - Posición del 5: " + posicion);
        
        // O(n log n) - Complejidad N Log N
        ComplejidadNLogN nLogN = new ComplejidadNLogN();
        int[] ordenadoMerge = nLogN.mergeSort(numeros);
        System.out.println("O(n log n) - Merge Sort: " + Arrays.toString(ordenadoMerge));
        
        // O(n²) - Complejidad Cuadrática
        ComplejidadCuadratica cuadratica = new ComplejidadCuadratica();
        int[] ordenadoBubble = cuadratica.bubbleSort(numeros);
        System.out.println("O(n²) - Bubble Sort: " + Arrays.toString(ordenadoBubble));
    }
}
