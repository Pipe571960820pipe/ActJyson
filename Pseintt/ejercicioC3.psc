Algoritmo ejercicioC3
	Definir numero Como Entero
	
	Escribir "Digite el numero:"
	Leer numero
	
	Si numero = 0 Entonces
		Escribir "El numero es 0"
	SiNo
		Si numero MOD 2 = 0 Entonces
			Si numero > 0 Entonces
				Escribir "El numero es par y es positivo"
			SiNo
				Escribir "El numero es par, pero es negativo"
			FinSi
		SiNo
			Si numero > 0 Entonces
				Escribir "El numero es impar y es positivo"
			SiNo
				Escribir "El numero es impar y es negativo"
			FinSi
		FinSi
	FinSi
FinAlgoritmo