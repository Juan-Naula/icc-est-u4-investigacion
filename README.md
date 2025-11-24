# **INFORME DE INVESTIGACION**


![alt text](assets/ups-icc.png)


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Juan Miguel Naula Abad - [Enlace a GitHub](https://github.com/Juan-Naula)

# Objetivos:

Colocar aquí los objetivos del trabajo.


# Marco Teórico: 

Colocar aquí el marco teórico del trabajo, los conceptos y definiciones relevantes.

## **1. Teoría de la Complejidad**

Es una rama de la ciencia de la computación que se ocupa
del estudio de la eficiencia computacional de algoritmos y
problemas. Se enfoca en analizar el tiempo y el espacio
requerido para la ejecución de un algoritmo en función del
tamaño de entrada y establecer clases de problemas según su
dificultad de resolución.

### 1.1 Definición general
Es un marco interdiciplinario que estudia cómo los sistemas
compuestos por múltiples elementos interactúan entre si, 
generando comportamientos emergentes que no pueden aplicarse 
únicamente por las partes individuales.
### 1.2 Importancia en la resolución de problemas
Es fundamental en la resolución de problemas porque ofrece
un marco para entender y manejar situacciones donde intervienen
múltiples factores, interacciones y niveles de incertidumbre. 
### 1.3 Eficiencia de algoritmos

* **Coste temporal:** 
    Cantidad de tiempo que
    se demora en ejecutar un
    algoritmo para completar
    su ejecución.
* **Coste espacial:** 
    Cantidad de memoria
    utilizada para resolver un
    problema.Basado en la
    cantidad de elementos de
    entrada que recibe.
### 1.4 Factores de tiempo de ejecución

* **Factores propios:** 
    Estrategia, Tipos de datos.
* **Factores circunstanciales:**
    Lenguaje de programación, Compilador, Recursos del PC.
* **Análisis teórico:**
    Independiente del entorno de programación, Se estima en función de los factores propios.

* **Análisis experimental:**
    Se incluye el tiempo recial que se
    necesita para ejecutar, y también
    la cantidad de bytes de memoria
    que se ocupa.

### 1.5 Notación de complejidad

* **Big O:**
    Notación matemática utilizada en la teoría de la
    complejidad de algoritmos para describir la
    eficiencia de un algoritmo en términos de la
    cantidad de recursos que consume en función
    del tamaño de entrada.
* **Mejor caso:**
    Es la complejidad mínima que puede alcanzar un algoritmo
    cuando las condiciones de entrada son ideales. 
* **Peor caso:**
    Mide el limite superior del tiempo de ejecución o uso de memoria de un algoritmo.
* **Caso promedio:**
    Mide el número de operaciones que un algoritmo realiza en
    condiciones normales.
* **Big O, Ω, Θ:**
    Big O es el limite superior, Omega es el limite inferior y Theta es el crecimiento exacto.

---

## **2. Ejemplos de Complejidad en Java**

En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una.

---

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public int obtenerPrimerElemento(int[] array) {
    return array[0];
}
```

### **Explicación resumida**

Accede a un elemento en tiempo constante; la duración no depende del tamaño de la entrada (O(1)).

### **Archivo:** `ComplejidadCuadratica.java`

### **Código del ejemplo**

```java
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
```

### **Explicación resumida**

    Dos bucles anidados comparan elementos; en el peor caso las operaciones crecen proporcionalmente a n² (O(n²)).

### **Archivo:** `ComplejidadLineal.java`

### **Código del ejemplo**

```java
public int sumarElementos(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
}
```

### **Explicación resumida**

Recorre todos los elementos una vez; el tiempo crece proporcionalmente al número de elementos (O(n)).

### **Archivo:** `ComplejidadLogaritmica.java`

### **Código del ejemplo**

```java
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
```

### **Explicación resumida**

Divide el espacio de búsqueda a la mitad en cada paso, por eso el número de pasos crece como el logaritmo de n (O(log n)).

### **Archivo:** `ComplejidadNLogN.java`

### **Código del ejemplo**

```java
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
```



# **Conclusiones**

Este trabajo nos ayuda a saber mas como utilizar estos tipos de complejidades ya sea para entender como escalan los algoritmos y poder 
predecir sus comportamientos en diferentes condiciones

**POR ESTUDIANTE**: *Juan Miguel Naula Abad*

---