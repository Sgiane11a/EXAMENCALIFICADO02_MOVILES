package com.cordova.gianella.laboratoriocalificado02_gianellacordova

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    private lateinit var name: String
    private lateinit var phone: String
    private lateinit var products: String
    private lateinit var address: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        name = intent.getStringExtra("name") ?: ""
        phone = intent.getStringExtra("phone") ?: ""
        products = intent.getStringExtra("products") ?: ""
        val city = intent.getStringExtra("city") ?: ""
        address = intent.getStringExtra("address") ?: ""

        val tvInfo = findViewById<TextView>(R.id.tvInfo)
        tvInfo.text = "Nombre: $name\nTeléfono: $phone\nProductos: $products\nCiudad: $city\nDirección: $address"

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            Toast.makeText(this, "Llamando a $name ($phone)", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnWhatsApp).setOnClickListener {
            val message = "Hola $name. Tus productos: $products están en camino a la dirección: $address"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }

        findViewById<Button>(R.id.btnMaps).setOnClickListener {
            Toast.makeText(this, "Dirección de entrega: $address", Toast.LENGTH_SHORT).show()
        }
    }
}