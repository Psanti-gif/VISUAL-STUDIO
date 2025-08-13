import random

class Matriz():
    def __init__(self,n):
        self.tamaño = n

def tamaño_matriz(n):
    matriz = [[random.randint(1,50)for _ in range(n)]for _ in range(n)]
    for fila in matriz:
        for elemento in fila:
            print(f"- {elemento} ",end="" )
        print()

def suma_matriz(n):
    matriz = [[random.randint(1,50)for _ in range(n)]for _ in range(n)]
    for fila in matriz:
        for elemento in fila:
            print(f" - {elemento} ", end="")
        print()
    



tamaño_matriz(4)
    
        


