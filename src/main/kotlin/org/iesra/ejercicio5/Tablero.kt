package org.iesra.ejercicio5

class Tablero {

    private val celdas: Array<Array<Char>>

    init {
        celdas = Array(3) { Array(3) { ' ' } }
    }

    fun colocarFicha(fila: Int, columna: Int, ficha: Char): Boolean {
        if (fila !in 0..2 || columna !in 0..2) {
            return false
        }

        if (celdas[fila][columna] != ' ') {
            return false
        }

        celdas[fila][columna] = ficha
        return true
    }

    fun estaVacia(fila: Int, columna: Int): Boolean {
        if (fila !in 0..2 || columna !in 0..2) {
            return false
        }
        return celdas[fila][columna] == ' '
    }

    fun estaLleno(): Boolean {
        for (fila in 0..2) {
            for (columna in 0..2) {
                if (celdas[fila][columna] == ' ') {
                    return false
                }
            }
        }
        return true
    }

    fun obtenerCelda(fila: Int, columna: Int): Char {
        if (fila !in 0..2 || columna !in 0..2){
            return ' '
        }
        return celdas[fila][columna]
    }

    fun mostrar() {
        println("   0   1   2")
        for (fila in 0..2) {
            print("$fila ")
            for (columna in 0..2) {
                print(" ${celdas[fila][columna]} ")
                if (columna < 2) print("|")
            }
            println()
            if (fila < 2) println("  -----------")
        }
    }

}
