package org.iesra



fun main() {

    println("\nEjercicio Rectangulo")
    println("--------------------------------")

    val r1 = Rectangulo(5.0, 3.0)
    val r2 = Rectangulo(10.0, 4.5)
    val r3 = Rectangulo(2.0, 2.0)

    val rectangulos = listOf(r1, r2, r3)

    for (r in rectangulos) {
        println(r)
        println("Area: ${r.area()}")
        println("Perímetro: ${r.perimetro()}")
        println("\n")
    }

    println("\nEjercicio Persona")
    println("--------------------------------")




}

