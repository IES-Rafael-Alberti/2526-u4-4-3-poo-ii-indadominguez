package org.iesra.ejercicio4

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Tarea(
    val id: Int,
    val descripcion: String
) {

    var realizada: Boolean = false
        private set

    private var fechaRealizacion: String? = null

    fun marcarComoRealizada() {
        if (!realizada) {
            realizada = true
            val fechaHoraActual = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
            fechaRealizacion = fechaHoraActual.format(formatter)
        }
    }

    override fun toString(): String {
        return if (realizada) {
            "ID: $id | $descripcion | REALIZADA el $fechaRealizacion"
        } else {
            "ID: $id | $descripcion | PENDIENTE"
        }
    }
}
