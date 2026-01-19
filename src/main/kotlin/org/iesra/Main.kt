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




    println("\nEjercicio 4 Coche")
    println("--------------------------------")

    println("creando coche no valido...")
    try {
        val coche1 = Coche("seat", "ibiza", 90, 5, "1234ABC", "Blanco")
        println("Creado: $coche1")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    println("\ncreando coche no valido")
    probarCoche("", "Ibiza", 100, 5, "1234ABC", "Rojo")

    println("\ncreando coche inferior a 70 caballos")
    probarCoche("Ford", "Focus", 50, 5, "1234ABC", "Azul")

    println("\ncreando coche puertas incorrectas")
    probarCoche("Renault", "Clio", 100, 2, "1234ABC", "Negro")

    println("\ncreando coche matrícula incorrecta")
    probarCoche("Audi", "A3", 150, 3, "123", "Gris")

    println("\ninstanciar y modificar el color a un valor nulo")
    try {
        val cocheOk = Coche("Tesla", "Model 3", 300, 5, "9999XYZ", "Negro")
        cocheOk.color = null
    } catch (e: IllegalArgumentException) {
        println("Error al modificar color: ${e.message}")
    }



    println("\nEjercicio 5 Tiempo")
    println("--------------------------------")



}

