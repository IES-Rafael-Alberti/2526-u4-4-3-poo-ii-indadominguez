package org.iesra.ejercicio1

fun main() {

    val domicilio1 = Domicilio("Calle Las Flores", 355)
    val domicilio2 = Domicilio("Mirasol", 218)
    val domicilio3 = Domicilio("La Mancha", 761)

    val cliente1 = Cliente("Nuria Costa", domicilio1)
    val cliente2 = Cliente("Jorge Russo", domicilio2)
    val cliente3 = Cliente("Julián Rodriguez", domicilio3)

    val compra1 = Compra(cliente1, 5, 12780.78)
    val compra2 = Compra(cliente2, 7, 699.0)
    val compra3 = Compra(cliente1, 7, 532.90)
    val compra4 = Compra(cliente3, 12, 5715.99)
    val compra5 = Compra(cliente2, 15, 958.0)

    val repositorio = RepositorioCompras()

    repositorio.agregarCompra(compra1)
    repositorio.agregarCompra(compra2)
    repositorio.agregarCompra(compra3)
    repositorio.agregarCompra(compra4)
    repositorio.agregarCompra(compra5)

    println("Domicilios a los que se debe enviar factura:")
    repositorio.domicilios().forEach {
        println(it.dirCompleta())
    }
}
