package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {

    private lateinit var registerButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener {
            val intent = Intent(this, UploadVehicleActivity::class.java);
            startActivity(intent);
        }
    }
}