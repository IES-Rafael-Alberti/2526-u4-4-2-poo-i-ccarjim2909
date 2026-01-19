package org.iesra

class Coche(marca: String?, modelo: String?, val numCaballos: Int?, val numPuertas: Int?, val matricula: String?, color: String?) {

    val marca: String? = marca
        get() = field?.lowercase()?.replaceFirstChar { it.uppercase() }

    val modelo: String? = modelo
        get() = field?.lowercase()?.replaceFirstChar { it.uppercase() }

    var color: String? = color
        set(value) {
            if (value == null) {
                throw IllegalArgumentException("El color no puede ser nulo.")
            }
            field = value
        }


    init {

        if (marca == null || marca.isBlank()) {
            throw IllegalArgumentException("La marca no puede ser nula ni vacia.")
        }
        if (modelo == null || modelo.isBlank()) {
            throw IllegalArgumentException("El modelo no puede ser nulo ni vacio.")
        }

        if (matricula == null || matricula.length != 7) {
            throw IllegalArgumentException("La matrícula debe tener 7 caracteres.")
        }

        if (numCaballos == null || numCaballos !in 70..700) {
            throw IllegalArgumentException("El número de caballos debe estar entre 70 y 700.")
        }


        if (numPuertas == null || numPuertas !in 3..5) {
            throw IllegalArgumentException("El número de puertas debe estar entre 3 y 5.")
        }


    }

    override fun toString(): String {
        return "[COCHE] Marca: $marca, Modelo: $modelo, CV: $numCaballos, Puertas: $numPuertas, Matrícula: $matricula, Color: $color"
    }
}




// funcion para probar los coches y que no pete
fun probarCoche(ma: String?, mo: String?, cv: Int?, pu: Int?, mat: String?, col: String?) {
    try {
        val c = Coche(ma, mo, cv, pu, mat, col)
        println(c)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
}