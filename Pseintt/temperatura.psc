Algoritmo temperatura
	Definir celsius, fahrenheit, factor, desfase Como Real
	
	factor <- 1.8
	desfase <- 32
	
	Escribir "Digite la temperatura que desea convertir (en grados Celsius):"
	Leer celsius
	
	fahrenheit <- (celsius * factor) + desfase
	
	Escribir "La temperatura convertida es: ", fahrenheit, " grados Fahrenheit"
FinAlgoritmo
