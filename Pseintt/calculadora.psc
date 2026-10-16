Algoritmo calculadora
	Definir opcion Como Entero
	Definir num1, num2, resultado Como Real
	
	Escribir "Menu"
	Escribir "1. Suma"
	Escribir "2. Resta"
	Escribir "3. Multiplicacion"
	Escribir "4. Division"
	Escribir "Digite la opcion:"
	Leer opcion
	
	Escribir "Digite el numero 1:"
	Leer num1
	Escribir "Digite el numero 2:"
	Leer num2
	
	Segun opcion Hacer
		1:
			resultado <- num1 + num2
			Escribir "La suma es: ", resultado
		2:
			resultado <- num1 - num2
			Escribir "La resta es: ", resultado
		3:
			resultado <- num1 * num2
			Escribir "La multiplicacion es: ", resultado
		4:
			Si num2 = 0 Entonces
				Escribir "No se puede dividir por cero"
			SiNo
				resultado <- num1 / num2
				Escribir "La division es: ", resultado
			FinSi
		De Otro Modo:
			Escribir "Opcion no existe"
			
	FinSegun
FinAlgoritmo
