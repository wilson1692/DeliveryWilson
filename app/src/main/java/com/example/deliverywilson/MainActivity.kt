package com.example.deliverywilson


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.deliverywilson.databinding.ActivityMainBinding
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {



    private lateinit var views: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)
        initializacionListener()
    }

    private fun initializacionListener() {

        views.buttonLoggin.setOnClickListener {
            val user = views.editTextTextPersonName.text.toString()
            val password = views.editTextTextPassword.text.toString()


            user?.let {
                password?.let { itp ->
                    if (it.equals("eduardo") && itp.equals("123456")) {

                        Form(user)
                    } else {
                        Toast.makeText(this, "Los campos estan vacios o son incorrectos"+ " \n "+ "Intentelo otra vez", Toast.LENGTH_LONG).show()
                        views.editTextTextPersonName.setText("")
                        views.editTextTextPassword.setText("")
                        views.editTextTextPersonName.requestFocus()
                    }
                }
            }
        }
    }

    private fun Form(user: String) {
        var intent = Intent(this, Form::class.java)
        intent.putExtra("name_user", user)
        startActivity(intent)

    }
}