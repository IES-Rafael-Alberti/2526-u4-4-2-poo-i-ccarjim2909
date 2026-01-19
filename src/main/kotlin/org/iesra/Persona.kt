package org.iesra

class Persona(var peso: Double, var altura: Double) {

    var nombre: String? = null
        set(value) {
            field = value
        }

    val imc: Double
        get() = peso / (altura * altura)

    init {
        if (peso <= 0) {
            throw IllegalArgumentException("El peso debe ser mayor que 0")
        }
        if (altura <= 0) {
            throw IllegalArgumentException("La altura debe ser mayor que 0")
        }
    }


    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Persona(nombre=$nombre, peso=$peso, altura=$altura, imc=${"%.2f".format(imc)})"
    }


    // Rarete esto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return peso == other.peso &&
                altura == other.altura &&
                nombre == other.nombre
    }
}

