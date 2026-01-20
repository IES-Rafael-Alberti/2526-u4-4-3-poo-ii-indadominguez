package org.iesra.ejercicio2

fun main() {

    val persona = Persona("77495765W")

    val cuenta1 = Cuenta(1, 0.0)
    val cuenta2 = Cuenta(2, 700.0)

    persona.añadirCuenta(cuenta1)
    persona.añadirCuenta(cuenta2)

    cuenta1.abonos(1100.0)

    cuenta2.pagar(750.0)

    println("¿Es morosa? ${Cuenta.esMorosa(persona)}")

    Cuenta.transferencia(persona, 1, persona, 2, 100.0)

    println("Saldo cuenta 1: ${cuenta1.getSaldo()}")
    println("Saldo cuenta 2: ${cuenta2.getSaldo()}")
    println("¿Es morosa ahora? ${Cuenta.esMorosa(persona)}")
}
