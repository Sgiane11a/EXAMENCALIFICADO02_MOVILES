package com.cordova.gianella.laboratoriocalificado02_gianellacordova

class Agenda {
    private val contactos = mutableListOf<Contacto>()
    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: ${contacto.nombre}")
    }
    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            println("Lista de contactos:")
            contactos.forEach {
                println("- ${it.nombre} | Tel: ${it.telefono} | Email: ${it.correo}")
            }
        }
    }
    fun buscarContacto(nombre: String) {
        val resultado = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (resultado.isEmpty()) {
            println("No se encontró ningún contacto con el nombre '$nombre'.")
        } else {
            println("Resultados de búsqueda:")
            resultado.forEach {
                println("- ${it.nombre} | Tel: ${it.telefono} | Email: ${it.correo}")
            }
        }
    }
}
