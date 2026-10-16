Algoritmo Ejercicio6
	Definir suma, numero, promedio Como Real
	Definir cantidad Como Entero
	
	suma <- 0
	cantidad <- 0
	
	Escribir "Ingrese un numero (negativo para terminar):"
	Leer numero
	
	Mientras numero >= 0 Hacer
		suma <- suma + numero
		cantidad <- cantidad + 1
		Escribir "Ingrese un numero (negativo para terminar):"
		Leer numero
	FinMientras
	
	Si cantidad > 0 Entonces
		promedio <- suma / cantidad
		Escribir "Cantidad de lecturas: ", cantidad
		Escribir "Suma total: ", suma
		Escribir "Promedio: ", promedio
	SiNo
		Escribir "No se ingresaron numeros validos"
	FinSi
	
	
FinAlgoritmo