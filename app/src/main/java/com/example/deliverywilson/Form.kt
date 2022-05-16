package com.example.deliverywilson

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliverywilson.databinding.ActivityFormBinding




class Form : AppCompatActivity() {

    private lateinit var views: ActivityFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityFormBinding.inflate(layoutInflater)
        setContentView(views.root)
        showName(intent)
    }

    private fun showName(intent: Intent) {
        val username = intent.getStringExtra("name_user")
        views.user.setText(" Bienvendio "+ username)
    }


}


