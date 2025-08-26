# Estructuras de Datos

## Evaluación
Exámenes Departamentales	- 60%

1. Unidad 1 (polinomios) y unidad 2 (pilas, colas, y listas ligadas)
2. Unidad 3 (grafos) y unidad 4 (árboles)
3. Unidad 5 (hash) y aplicaciones

Laboratorio y tareas		- 40%

Punto extra
Actividades en clase
mediante firmas			- 0.1%

Asistencia			- 1 punto


## Polinomios de direccionamiento
Los polinomios de direccionamiento se tratan de buscar una posición que contiene un dato.

SOn fórmulas matemáticas utilizadas para calcular la dirección absoluta (o posición en memoria) de un elemento almacenado en un arreglo, a partir de sus índices.

Si nos referimos a A[2]
Pd (A[2]) = DirA + (1 * k)

Pd (A[2]) = DirA + (x - 1) k

### Polinomio de direccionamiento para vectores

Pd (A[x]) = DirA + x * lt

Donde:
- DirA: Dirección inicial del arreglo
- x: Posición correspondiente al índice del arreglo (base 0 o 1)
- lt: Longitud del dato



### Polinomio de direccionamiento para matrices

Filas:
Pd (M[i][j]) = DirM + [m * i + j] * lt

Filas:
Pd (M[i][j]) = DirM + [n * j + i] * lt


Donde:
- DirM: Dirección inicial de la matriz
- i: índice de filas
- j: índice de columnas
- m: número de columnas
- n: número de filas
- lt: Longitud del dato


Las estructuras de datos se clasifican en estáticas y dinámicas.
Estáticas:
- Arreglos
- Variables
- Matrices

Dinámicas:
- Listas ligadas

## Pilas
Una pila es una estructura LIFO.
Las operaciones que se pueden realizar en una pila son:
- Agregar elemento ```push```
- Obtener el elemento de la cima ```pop```
- Conocer el valor del último elemento ```peek```
- Obtener el tamaño de la pila
- Saber si la pila está llena

Así tomo mis apuntes en clase, porque me da flojera escribir y porque luego los puedo abrir en sitios web con repos de código

