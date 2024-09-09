package com.example.heroesapp.models

class Publisher (val id: Int, val name: String, val img: String){
    companion object {
        val publishers = mutableListOf<Publisher>(
            Publisher(1, "Marvel", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjmHn7hDycWvYvGnj50dxygz2EUz8MBKKCqg&s"),
            Publisher(2, "DC", "https://static1.srcdn.com/wordpress/wp-content/uploads/2020/03/DC-Comics-Logo.jpg")
        )
    }
}