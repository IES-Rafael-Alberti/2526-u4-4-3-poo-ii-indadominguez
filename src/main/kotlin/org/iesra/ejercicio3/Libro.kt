package org.iesra.ejercicio3

class Libro(
    val titulo: String,
    val autor: String,
    val numPaginas: Int,
    var calificacionIni: Int
) {

    var calificacion: Int = 0
        set(valor) {
            field = if (valor in 0..10) valor else 0
        }

    init {
        calificacion = calificacionIni
    }


    override fun toString(): String {
        return ("Titulo: $titulo, Autor: $autor, Páginas: $numPaginas, Calificación: $calificacion")
    }
}