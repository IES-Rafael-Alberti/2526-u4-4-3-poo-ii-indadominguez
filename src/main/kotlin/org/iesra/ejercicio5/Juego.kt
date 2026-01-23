package org.iesra.ejercicio5

class Juego(
    private val jugador1: Jugador,
    private val jugador2: Jugador
) {
    private val tablero = Tablero()
    private var turnoActual: Jugador = jugador1
    private var terminado: Boolean = false

    private fun cambiarTurno() {
        turnoActual = if (turnoActual == jugador1) jugador2 else jugador1
    }

    private fun hayGanador(): Boolean {
        for (i in 0..2) {
            if (tablero.obtenerCelda(i,0) != ' ' &&
                tablero.obtenerCelda(i,0) == tablero.obtenerCelda(i,1) &&
                tablero.obtenerCelda(i,1) == tablero.obtenerCelda(i,2)) {
                return true
            }
        }
        for (i in 0..2) {
            if (tablero.obtenerCelda(0,i) != ' ' &&
                tablero.obtenerCelda(0,i) == tablero.obtenerCelda(1,i) &&
                tablero.obtenerCelda(1,i) == tablero.obtenerCelda(2,i)) {
                return true
            }
        }
        if (tablero.obtenerCelda(0,0) != ' ' &&
            tablero.obtenerCelda(0,0) == tablero.obtenerCelda(1,1) &&
            tablero.obtenerCelda(1,1) == tablero.obtenerCelda(2,2)) {
            return true
        }
        if (tablero.obtenerCelda(0,2) != ' ' &&
            tablero.obtenerCelda(0,2) == tablero.obtenerCelda(1,1) &&
            tablero.obtenerCelda(1,1) == tablero.obtenerCelda(2,0)) {
            return true
        }

        return false
    }


    fun iniciar() {
        while (!terminado) {
            tablero.mostrar()
            println("${turnoActual.nombre}, introduce fila y columna (0-2):")

            val fila = readLine()?.toIntOrNull() ?: -1
            val columna = readLine()?.toIntOrNull() ?: -1

            if (fila in 0..2 && columna in 0..2 && tablero.estaVacia(fila, columna)) {
                tablero.colocarFicha(fila, columna, turnoActual.ficha)

                if (hayGanador()) {
                    tablero.mostrar()
                    println("¡${turnoActual.nombre} ha ganado!")
                    terminado = true
                } else if (tablero.estaLleno()) {
                    tablero.mostrar()
                    println("¡Empate!")
                    terminado = true
                } else {
                    cambiarTurno()
                }
            } else {
                println("Movimiento inválido, prueba otra vez.")
            }
        }
    }
}



