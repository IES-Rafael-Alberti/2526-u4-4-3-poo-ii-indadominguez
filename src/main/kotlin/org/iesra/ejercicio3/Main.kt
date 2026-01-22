package org.iesra.ejercicio3

fun main() {
    val libro1 = Libro("Harry Potter y el prisionero de Azkaban", "J.K.Rowling", 370, 10)
    val libro2 = Libro("It", "Stephen King", 1504, 8)

    val conjunto = ConjuntoLibros(5)

    conjunto.anadirLibro(libro1)
    conjunto.anadirLibro(libro2)

    conjunto.mostrarConjunto()

    conjunto.eliminarPorTitulo("Harry Potter y el prisionero de Azkaban")
    conjunto.eliminarPorAutor("Stephen King")

    conjunto.mostrarConjunto()

    val libro3 = Libro("Clean Code", "Robert C. Martin", 464, 6)
    conjunto.anadirLibro(libro3)

    conjunto.mostrarConjunto()
    conjunto.mostrarMayorYMenorCalificacion()
}




