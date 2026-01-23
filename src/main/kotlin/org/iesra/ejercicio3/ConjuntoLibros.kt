package org.iesra.ejercicio3


class ConjuntoLibros(tamanio: Int) {

    private val libros: Array<Libro?> = arrayOfNulls(tamanio)
    private var contador = 0

    fun anadirLibro(libro: Libro): Boolean {
        if (contador >= libros.size || existeLibro(libro)) {
            return false
        }
        libros[contador] = libro
        contador++
        return true
    }

    private fun existeLibro(libro: Libro): Boolean {
        for (i in 0 until contador) {
            if (libros[i]?.titulo == libro.titulo &&
                libros[i]?.autor == libro.autor
            ) {
                return true
            }
        }
        return false
    }

    fun eliminarPorTitulo(titulo: String): Boolean {
        for (i in 0 until contador) {
            if (libros[i]?.titulo == titulo) {
                eliminarEnPosicion(i)
                return true
            }
        }
        return false
    }

    fun eliminarPorAutor(autor: String): Boolean {
        var eliminado = false
        var i = 0

        while (i < contador) {
            if (libros[i]?.autor == autor) {
                eliminarEnPosicion(i)
                eliminado = true
            } else {
                i++
            }
        }
        return eliminado
    }

    private fun eliminarEnPosicion(posicion: Int) {
        for (i in posicion until contador - 1) {
            libros[i] = libros[i + 1]
        }
        libros[contador - 1] = null
        contador--
    }

    fun mostrarMayorYMenorCalificacion() {
        if (contador == 0) {
            println("No hay libros en el conjunto")
            return
        }

        if (contador == 1) {
            println("Solo hay un libro:")
            println(libros[0])
            return
        }

        var mayor = libros[0]!!
        var menor = libros[0]!!

        for (i in 1 until contador) {
            val libroActual = libros[i]!!
            if (libroActual.calificacion > mayor.calificacion) {
                mayor = libroActual
            }
            if (libroActual.calificacion < menor.calificacion) {
                menor = libroActual
            }
        }

        println("Libro con mayor calificación:")
        println(mayor)
        println("Libro con menor calificación:")
        println(menor)
    }

    fun mostrarConjunto() {
        if (contador == 0) {
            println("El conjunto está vacío")
        } else {
            for (i in 0 until contador) {
                println(libros[i])
            }
        }
    }
}
