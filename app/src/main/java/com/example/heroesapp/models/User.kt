package com.example.heroesapp.models

data class User(val email: String, val password: String, val name: String) {
    companion object{
        val staticUser = listOf(
            User(email="leo@gmail.com", password = "12345", name="Leo"),
            User(email="miguel@hotmail.com", password = "12345", name="Miguel"),
            User(email="max@outlook.com", password = "12345", name="Max"),
            User(email="diego@yahoo.com", password = "12345", name="Diego"),
            User(email="naomi@gmail.com", password = "12345", name="Naomi")
        )
    }
}