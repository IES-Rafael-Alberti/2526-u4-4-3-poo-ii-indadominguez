package org.iesra.ejercicio1

class RepositorioCompras {

    private val compras: MutableList<Compra> = mutableListOf()


    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }


    fun domicilios(): Set<Domicilio> {
        return compras
            .map { it.cliente.domicilio }
            .toSet()
    }
}
