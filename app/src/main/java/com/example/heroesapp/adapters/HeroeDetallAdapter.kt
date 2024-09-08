package com.example.heroesapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroeDetallAdapter(val heroeLits: List<Heroe>, val onClick: (Heroe) -> Unit): RecyclerView.Adapter<HeroeDetallViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeDetallViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_detall_heroe,parent, false)
        return HeroeDetallViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeroeDetallViewHolder, position: Int) {
        val heroe = heroeLits[position]
        holder.heroeName.text = heroe.name
        Picasso.get().load(heroe.img).into(holder.heroeImg)
        holder.heroeDescription.text = heroe.descripcion

        holder.itemView.setOnClickListener{
            Log.i("Heroe", heroe.name)
            onClick(heroe)
        }
    }

    override fun getItemCount(): Int {
        return heroeLits.count()
    }

}

class HeroeDetallViewHolder(view: View): ViewHolder(view)
{
    val heroeName: TextView = view.findViewById(R.id.heroeNameTV)
    val heroeImg: ImageView = view.findViewById(R.id.heroe_image_detall)
    val heroeDescription: TextView = view.findViewById(R.id.heroe_description)
}