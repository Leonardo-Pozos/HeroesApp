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
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class HeroeAdapter(val heroes: List<Heroe>, val onClick: (Heroe) -> Unit): RecyclerView.Adapter<HeroeViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item,parent,false)
        return HeroeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.count()
    }

    override fun onBindViewHolder(holder: HeroeViewHolder, position: Int) {
        val heroe = heroes[position]
        Picasso.get().load(heroe.img).into(holder.heroeImage)

        holder.itemView.setOnClickListener{
            Log.i("Heroe", heroe.name)
            onClick(heroe)
        }
    }

}

class HeroeViewHolder(view: View): ViewHolder(view){
    val heroeImage: ImageView = view.findViewById(R.id.heroe_image)
}