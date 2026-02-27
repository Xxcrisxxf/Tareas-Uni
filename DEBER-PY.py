matriz = [[0 for _ in range(5)] for _ in range(5)]

for i in range(5):
    for j in range(5):
        valor = int(input(f"Ingrese el valor para la posición [{i}][{j}]: "))
        matriz[i][j] = valor

print("\nMatriz ingresada:")
for i in range(5):
    for j in range(5):
        print(matriz[i][j], end=" ")
    print()