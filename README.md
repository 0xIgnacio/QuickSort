Pseudo código para la clase QuickSort donde está implementado el algoritmo de ordenación de un arreglo de enteros

```
Clase QuickSort:

    Método swap(arreglo, i, j):
        Intercambiar arreglo[i] con arreglo[j]

    Método partition(arreglo, inicio, fin):
        pivot = arreglo[fin]
        i = inicio - 1

        Para j desde inicio hasta fin - 1:
            Si arreglo[j] es menor o igual que pivot:
                Incrementar i
                swap(arreglo, i, j)

        swap(arreglo, i + 1, fin)
        Retornar i + 1

    Método quicksort(arreglo, inicio, fin):
        Si inicio es menor que fin:
            part = partition(arreglo, inicio, fin)
            quicksort(arreglo, inicio, part - 1)
            quicksort(arreglo, part + 1, fin)

    Método printArray(arreglo):
        Para cada elemento en arreglo:
            Imprimir elemento seguido de un espacio
        Imprimir nueva línea

    Método main():
        Ejemplo de arreglo = [4, 7, 2, 8, 9, 25, 3]
        Imprimir "Array original:"
        printArray(arreglo)

        quicksort(arreglo, 0, longitud del arreglo - 1)

        Imprimir "Array ordenado:"
        printArray(arreglo)
```
