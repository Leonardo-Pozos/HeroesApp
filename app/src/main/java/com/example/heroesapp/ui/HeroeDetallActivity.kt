package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroeAdapter
import com.example.heroesapp.adapters.HeroeDetallAdapter
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class HeroeDetallActivity : AppCompatActivity(){
    lateinit var heroeTV: TextView
    lateinit var heroeImg: ImageView
    lateinit var heroeDetall: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detall_heroe)
        heroeTV = findViewById(R.id.heroeNameTV)
        heroeImg = findViewById(R.id.heroe_image_detall)
        heroeDetall = findViewById(R.id.heroe_description)

        val heroeId = intent.getIntExtra("heroeId", 0)
        Log.i("HeroeActivity", "El id es ${heroeId.toString()}")
        val heroe = Heroe.heroes.firstOrNull{ it.id == heroeId}
        Log.i("El heroe", heroe.toString())
        heroeTV.text = heroe?.name
        heroeDetall.text = heroe?.descripcion
        heroe?.let {
            Picasso.get()
                .load(it.img) // Carga la imagen desde la URL
                .into(heroeImg) // El ImageView donde se cargará la imagen
        }
    }
}