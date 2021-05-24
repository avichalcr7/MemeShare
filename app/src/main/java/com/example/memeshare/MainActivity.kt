package com.example.memeshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createworld(view: View) {
        val intent= Intent(this,MainActivity2::class.java)
        Toast.makeText(this,"Created By Avichal Pathak",Toast.LENGTH_SHORT).show()
        startActivity(intent)

    }
    override fun onPause() {
        super.onPause()
        finish()
    }
}