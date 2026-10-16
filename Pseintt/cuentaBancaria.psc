Algoritmo cuentaBancaria
	Definir titular Como Caracter
	Definir saldo Como Real
	
	titular <- "Andres Felipe"
	saldo <- 100000
	
	Escribir "Titular: ", titular
	Escribir "Saldo inicial: $", consultarSaldo(saldo)
	
	depositar(saldo, 50000)
	Escribir "Saldo actual: $", consultarSaldo(saldo)
	
	retirar(saldo, 30000)
	Escribir "Saldo actual: $", consultarSaldo(saldo)
	
	retirar(saldo, 500000)
	Escribir "Saldo final: $", consultarSaldo(saldo)
FinAlgoritmo

SubProceso depositar(saldo Por Referencia, monto)
	Si monto > 0 Entonces
		saldo <- saldo + monto
		Escribir "Deposito exitoso de $", monto
	SiNo
		Escribir "El monto a depositar debe ser mayor que cero."
	FinSi
FinSubProceso

SubProceso retirar(saldo Por Referencia, monto)
	Si monto <= 0 Entonces
		Escribir "El monto debe ser mayor a 0"
	SiNo
		Si monto > saldo Entonces
			Escribir "Fondos insuficientes. Saldo disponible: $", saldo
		SiNo
			saldo <- saldo - monto
			Escribir "Retiro exitoso de $", monto
		FinSi
	FinSi
FinSubProceso

SubProceso resultado <- consultarSaldo(saldo)
	resultado <- saldo
	
FinSubProceso