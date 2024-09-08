package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.adapters.HeroeAdapter
import com.example.heroesapp.adapters.HeroeDetallAdapter
import com.example.heroesapp.adapters.PublisherAdapter

class HeroesActivity : AppCompatActivity(){
    lateinit var publisherTV: TextView
    lateinit var heroeRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        publisherTV = findViewById(R.id.publisher_activity_name)
        heroeRecyclerView = findViewById(R.id.heroes_activity_recyclerview)
        val publisherId = intent.getIntExtra("publisherId",0)
        Log.i("PublisherActivity","El id es ${publisherId.toString()}")
        val publisher = Publisher.publishers.firstOrNull{ it.id == publisherId}
        Log.i("La editorial", publisher.toString())
        //val heroes = Heroe.heroes.filter {it.publisherId == publisherId}
        publisherTV.text = publisher?.name
        //heroeRecyclerView.adapter = HeroeAdapter(heroes)
        heroeRecyclerView.adapter = HeroeAdapter(Heroe.heroes.filter {it.publisherId == publisherId}){ heroe ->
            val intent = Intent(this@HeroesActivity,HeroeDetallActivity::class.java).apply {
                putExtra("heroeId",heroe.id)
            }
            startActivity(intent)
        }
        heroeRecyclerView.layoutManager = GridLayoutManager(this,2)

        //heroeDetallRecyclerView.adapter = HeroeDetallAdapter(Heroe.heroes){ heroe ->
        //    val intent = Intent(this@HeroesActivity,HeroeDetallActivity::class.java).apply {
        //       putExtra("heroeId", heroe.id)
        //    }
        //    startActivity(intent)
        //}
    }
}