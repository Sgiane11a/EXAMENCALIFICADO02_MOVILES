package com.cordova.gianella.laboratoriocalificado02_gianellacordova
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class Ejercicio02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName = findViewById<EditText>(R.id.etName)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etProducts = findViewById<EditText>(R.id.etProducts)
        val etCity = findViewById<EditText>(R.id.etCity)
        val etAddress = findViewById<EditText>(R.id.etAddress)
        val btnAddOrder = findViewById<Button>(R.id.btnAddOrder)
        btnAddOrder.setOnClickListener {
            val name = etName.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            val products = etProducts.text.toString().trim()
            val city = etCity.text.toString().trim()
            val address = etAddress.text.toString().trim()

            if (name.isEmpty() || phone.isEmpty() || products.isEmpty() || city.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, DetailsActivity::class.java).apply {
                    putExtra("name", name)
                    putExtra("phone", phone)
                    putExtra("products", products)
                    putExtra("city", city)
                    putExtra("address", address)
                }
                startActivity(intent)
            }
        }
    }
}