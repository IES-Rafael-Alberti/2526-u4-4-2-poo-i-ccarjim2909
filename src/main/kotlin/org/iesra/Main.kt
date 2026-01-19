package org.iesra



fun main() {

    println("\nEjercicio 1 Rectangulo")
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

    println("\nEjercicio 2 Persona")
    println("--------------------------------")

    val p1 = Persona(70.0, 1.75)
    val p2 = Persona("Ana", 60.0, 1.65)
    val p3 = Persona("Luis", 80.0, 1.90)

    println(p1)
    println(p2)
    println(p3)
    println("\n")


    print("Introduce el nombre de la persona 1: ")
    val nombreIntroducido = readLine()

    if (!nombreIntroducido.isNullOrBlank()) {
        p1.nombre = nombreIntroducido
    }

    println("Persona 1 -> Nombre: ${p1.nombre}, Peso: ${p1.peso}, Altura: ${p1.altura}")
    println("\n")


    println("Persona 3 -> Peso: ${p3.peso}, Altura: ${p3.altura}, IMC: ${"%.2f".format(p3.imc)}")

    p3.altura = 1.80
    println("Persona 3 (altura modificada) -> Peso: ${p3.peso}, Altura: ${p3.altura}, IMC: ${"%.2f".format(p3.imc)}")
    println("\n")


    p2.altura = p3.altura

    println("Persona 2: $p2")
    println("Persona 3: $p3")

    val iguales = p2 == p3
    println("¿Persona 2 y Persona 3 son iguales? $iguales")


    println("\nEjercicio 3 Persona")
    println("--------------------------------")

}

