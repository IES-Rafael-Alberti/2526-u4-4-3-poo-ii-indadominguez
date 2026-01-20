package org.iesra.ejercicio2

class Cuenta(
    private var numeroCuenta: Int,
    private var saldo: Double

) {

    fun getNumeroCuenta(): Int {
        return numeroCuenta
    }

    fun getSaldo(): Double{
        return saldo
    }

    fun abonos(cantidad: Double) {
        if (cantidad > 0) {
            saldo += cantidad
        }

    }

    fun pagar(cantidad: Double) {
        if (cantidad > 0) {
            saldo -= cantidad
        }

    }

    companion object {

        fun esMorosa(persona: Persona): Boolean {
            for (cuenta in persona.getCuentas()) {
                if (cuenta != null && cuenta.getSaldo() < 0) {
                    return true
                }
            }
            return false
        }

        fun transferencia(
            personaOrigen: Persona,
            numeroCuentaOrigen: Int,
            personaDestino: Persona,
            numeroCuentaDestino: Int,
            cantidad: Double
        ): Boolean {

            val cuentaOrigen = personaOrigen.buscarCuenta(numeroCuentaOrigen)
            val cuentaDestino = personaDestino.buscarCuenta(numeroCuentaDestino)

            if (cuentaOrigen != null && cuentaDestino != null && cantidad > 0) {
                cuentaOrigen.pagar(cantidad)
                cuentaDestino.abonos(cantidad)
                return true
            }

            return false
        }

    }
}