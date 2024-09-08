package com.example.heroesapp.models

class Publisher (val id: Int, val name: String, val img: String){
    companion object {
        val publishers = mutableListOf<Publisher>(
            Publisher(1, "Marvel", "https://i.pinimg.com/736x/b5/34/df/b534df05c4b06ebd32159b2f9325d83f.jpg"),
            Publisher(2, "DC", "https://i.pinimg.com/736x/02/c2/2e/02c22ee1e45403b96e7d1abe0920ae65.jpg")
        )
    }
}