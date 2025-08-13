import random

n = int(input("Ingrese la dimensión de la matriz: "))

matriz = [[random.randint(1, 50) for _ in range(n)] for _ in range(n)]

for fila in matriz:
    for elemento in fila:
        print(f" - {elemento}", end="")
    print()
