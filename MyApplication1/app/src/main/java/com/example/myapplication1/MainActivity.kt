package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView.text = "Bonjour, Aboubakar!"
        myTextView.setTextColor(Color.parseColor("#FF5733"))

        // Récupération du LinearLayout et définition des paramètres de disposition
        val layout = findViewById<LinearLayout>(R.id.layout)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(20, 20, 50, 20)
        layout.layoutParams = params

        // Création du bouton
        val button = Button(this)
        button.text = "Cliquez-moi svp!"
        button.setBackgroundColor(Color.parseColor("#FF5733"))
        button.setTextColor(Color.WHITE)

        // Ajout du bouton au LinearLayout
        layout.addView(button)

        // Événement de clic du bouton
        button.setOnClickListener {
            myTextView.text = "Vous avez cliqué sur le bouton!"
            myTextView.setTextColor(Color.BLUE)
        }
    }
}
