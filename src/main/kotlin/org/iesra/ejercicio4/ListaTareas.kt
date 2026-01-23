package org.iesra.ejercicio4

class ListaTareas {

    private val tareas = mutableListOf<Tarea>()
    private var siguienteId = 1

    fun agregarTarea(descripcion: String) {
        val tarea = Tarea(siguienteId, descripcion)
        tareas.add(tarea)
        siguienteId++
    }

    fun eliminarTarea(id: Int): Boolean {
        val tarea = buscarTarea(id)
        return if (tarea != null) {
            tareas.remove(tarea)
            true
        } else {
            false
        }
    }

    fun marcarTareaComoRealizada(id: Int): Boolean {
        val tarea = buscarTarea(id)
        return if (tarea != null) {
            tarea.marcarComoRealizada()
            true
        } else {
            false
        }
    }

    private fun buscarTarea(id: Int): Tarea? {
        for (tarea in tareas) {
            if (tarea.id == id) {
                return tarea
            }
        }
        return null
    }

    fun mostrarTodas() {
        if (tareas.isEmpty()) {
            println("No hay tareas")
        } else {
            for (tarea in tareas) {
                println(tarea)
            }
        }
    }

    fun mostrarPendientes() {
        val pendientes = tareas.filter { !it.realizada }
        if (pendientes.isEmpty()) {
            println("No hay tareas pendientes")
        } else {
            for (tarea in pendientes) {
                println(tarea)
            }
        }
    }

    fun mostrarRealizadas() {
        val realizadas = tareas.filter { it.realizada }
        if (realizadas.isEmpty()) {
            println("No hay tareas realizadas")
        } else {
            for (tarea in realizadas) {
                println(tarea)
            }
        }
    }
}
