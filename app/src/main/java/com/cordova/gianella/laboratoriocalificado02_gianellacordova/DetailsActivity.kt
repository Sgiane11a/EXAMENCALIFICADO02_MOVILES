package com.cordova.gianella.laboratoriocalificado02_gianellacordova

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
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

        findViewById<TextView>(R.id.tvNombre).text = "Nombre: $name"
        findViewById<TextView>(R.id.tvTelefono).text = "Teléfono: $phone"
        findViewById<TextView>(R.id.tvProductos).text = "Productos: $products"
        findViewById<TextView>(R.id.tvCiudad).text = "Ciudad: $city"
        findViewById<TextView>(R.id.tvDireccion).text = "Dirección: $address"
        findViewById<ImageButton>(R.id.btnLlamar).setOnClickListener {
            Toast.makeText(this, "Llamando a $name ($phone)", Toast.LENGTH_SHORT).show()
        }
        findViewById<ImageButton>(R.id.btnWhatsapp).setOnClickListener {
            val message = "Hola $name. Tus productos: $products están en camino a la dirección: $address"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
        findViewById<ImageButton>(R.id.btnMaps).setOnClickListener {
            Toast.makeText(this, "Dirección de entrega: $address", Toast.LENGTH_SHORT).show()
        }
    }
}
