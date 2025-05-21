package com.cordova.gianella.laboratoriocalificado02_gianellacordova

fun main() {
    val agenda = Agenda()

    while (true) {
        println("\nAgenda de Contactos")
        println("1. Agregar contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto")
        println("4. Salir")
        print("Seleccione una opción: ")

        val input = readLine()
        val opcion = input?.toIntOrNull()

        if (opcion == null) {
            println("Entrada inválida. Debe ser un número.")
            continue
        }

        when (opcion) {
            1 -> {
                print("Ingrese nombre: ")
                val nombre = readLine() ?: ""
                print("Ingrese teléfono: ")
                val telefono = readLine() ?: ""
                print("Ingrese correo: ")
                val correo = readLine() ?: ""
                val contacto = Contacto(nombre, telefono, correo)
                agenda.agregarContacto(contacto)
            }
            2 -> agenda.listarContactos()
            3 -> {
                print("Ingrese nombre a buscar: ")
                val nombre = readLine() ?: ""
                agenda.buscarContacto(nombre)
            }
            4 -> {
                println("Saliendo de la aplicación...")
                break
            }
            else -> println("Opción inválida. Intente de nuevo.")
        }
    }
}
