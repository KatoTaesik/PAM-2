package com.example.myapplication8_3_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtNome:EditText = findViewById(R.id.edtNome)
        var btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{
            var toast = Toast.makeText(this, edtNome.text.toString(), Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}