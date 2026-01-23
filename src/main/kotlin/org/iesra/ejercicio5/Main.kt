package org.iesra.ejercicio5

fun main() {

    println("------- 3 EN RAYAA-------")


    println("Introduce el nombre del Jugador 1:")
    val nombre1 = readLine()?.takeIf { it.isNotBlank() } ?: "Jugador 1"

    println("Introduce el nombre del Jugador 2:")
    val nombre2 = readLine()?.takeIf { it.isNotBlank() } ?: "Jugador 2"

    val jugador1 = Jugador(nombre1, 'X')
    val jugador2 = Jugador(nombre2, 'O')

    val juego = Juego(jugador1, jugador2)
    juego.iniciar()
}