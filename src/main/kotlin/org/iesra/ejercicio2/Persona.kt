package org.iesra.ejercicio2

class Persona(private val dni: String) {

    private val cuentas: Array<Cuenta?> = arrayOfNulls(3)
    private var numeroCuentas = 0

    fun getDni(): String {
        return dni
    }

    fun getCuentas() : Array<Cuenta?> {
        return cuentas
    }

    fun añadirCuenta(cuenta: Cuenta) : Boolean {
        if (numeroCuentas < 3) {
            cuentas[numeroCuentas] = cuenta
            numeroCuentas++
            return true
        }
        return false
    }

    fun buscarCuenta(numeroCuenta: Int): Cuenta? {
        for(cuenta in cuentas){
            if (cuenta != null && cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta
            }
        }
        return null
    }
}
