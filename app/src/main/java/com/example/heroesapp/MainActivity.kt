package com.example.heroesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.models.User
import com.example.heroesapp.ui.PublisherActivity

class MainActivity : AppCompatActivity() {
    lateinit var loginBtn : Button
    lateinit var emailEntry: EditText
    lateinit var passwordEntry: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        val intent = Intent(this@MainActivity,PublisherActivity::class.java)
        if(isLogged){
            startActivity(intent)
            finish()
        }
        loginBtn = findViewById(R.id.loginBtn)
        emailEntry = findViewById(R.id.emailEntry)
        passwordEntry = findViewById(R.id.passwordEntry)
        loginBtn.setOnClickListener{
            Log.i("LOGAPP", "Iniciar sesión")
            val email = emailEntry.text.toString()
            val password = passwordEntry.text.toString()
            Log.i("EMAIL",email)
            Log.i("PASSWORD",password)
            if(email.isEmpty() || password.isEmpty()){
                Log.i("ERROR","El correo electrónico o contraseña esta vacio.")
                return@setOnClickListener
            }
            val isValidUser = User.staticUser.any{
                user -> user.email == email && user.password == password
            }
            if(!isValidUser){
                Log.i("ERROR", "El correo o la contraseña no es valida.")
                return@setOnClickListener
            }
            val user = User.staticUser.firstOrNull{
                it.email == email && it.password == password
            }
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged",true)
            editor.putString("userEmail",user?.email)
            editor.apply()

            startActivity(intent)
            finish()
        }
    }
}