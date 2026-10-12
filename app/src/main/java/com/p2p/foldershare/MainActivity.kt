package com.p2p.foldershare

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etConnectionCode = findViewById<EditText>(R.id.etConnectionCode)
        val btnConnect = findViewById<Button>(R.id.btnConnect)
        val btnFolders = findViewById<Button>(R.id.btnFolders)
        val btnPasswordManager = findViewById<Button>(R.id.btnPasswordManager)

        btnConnect.setOnClickListener {
            val code = etConnectionCode.text.toString().trim()
            if (code.isNotEmpty()) {
                Toast.makeText(this, "Connecting with code: $code", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter 6-digit code", Toast.LENGTH_SHORT).show()
            }
        }

        btnFolders.setOnClickListener {
            Toast.makeText(this, "Opening Folders & Files...", Toast.LENGTH_SHORT).show()
        }

        btnPasswordManager.setOnClickListener {
            Toast.makeText(this, "Opening Password Manager...", Toast.LENGTH_SHORT).show()
        }
    }
}
