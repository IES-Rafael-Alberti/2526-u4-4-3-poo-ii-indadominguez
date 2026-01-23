package org.iesra.ejercicio4

fun main() {

    val listaTareas = ListaTareas()
    var opcion: Int

    do {
        println("\n--- MENÚ LISTA DE TAREAS ---")
        println("1. Agregar tarea")
        println("2. Eliminar tarea")
        println("3. Marcar tarea como realizada")
        println("4. Mostrar todas las tareas")
        println("5. Mostrar tareas pendientes")
        println("6. Mostrar tareas realizadas")
        println("0. Salir")
        print("Elige una opción: ")

        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                print("Introduce la descripción: ")
                val descripcion = readln()
                listaTareas.agregarTarea(descripcion)
                println("Tarea añadida")
            }

            2 -> {
                print("Introduce el ID de la tarea a eliminar: ")
                val id = readln().toInt()
                if (listaTareas.eliminarTarea(id)) {
                    println("Tarea eliminada")
                } else {
                    println("Tarea no encontrada")
                }
            }

            3 -> {
                print("Introduce el ID de la tarea: ")
                val id = readln().toInt()
                if (listaTareas.marcarTareaComoRealizada(id)) {
                    println("Tarea marcada como realizada")
                } else {
                    println("Tarea no encontrada")
                }
            }

            4 -> listaTareas.mostrarTodas()

            5 -> listaTareas.mostrarPendientes()

            6 -> listaTareas.mostrarRealizadas()

            0 -> println("Saliendo del programa...")

            else -> println("Opción incorrecta")
        }

    } while (opcion != 0)
}
