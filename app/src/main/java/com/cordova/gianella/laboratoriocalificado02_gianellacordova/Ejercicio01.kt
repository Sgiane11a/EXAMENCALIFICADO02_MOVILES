package com.cordova.gianella.laboratoriocalificado02_gianellacordova
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio01)

        val greenView = findViewById<View>(R.id.greenView)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnOcultar = findViewById<Button>(R.id.btnOcultar)

        btnMostrar.setOnClickListener {
            greenView.visibility = View.VISIBLE
        }

        btnOcultar.setOnClickListener {
            greenView.visibility = View.GONE
        }
    }
}
