Algoritmo tablaMultiplicar
	Definir numero, pares, resultado, i Como Entero
	
	Escribir "Ingrese un numero entero:"
	Leer numero
	
	pares <- 0
	Escribir "Tabla de multiplicar del ", numero
	
	Para i <- 1 Hasta 10 Con Paso 1 Hacer
		resultado <- numero * i
		Escribir numero, " x ", i, " = ", resultado
		
		Si resultado MOD 2 = 0 Entonces
			pares <- pares + 1
		FinSi
	FinPara
	
	Escribir ""
	Escribir "Cantidad de resultados pares: ", pares
FinAlgoritmo