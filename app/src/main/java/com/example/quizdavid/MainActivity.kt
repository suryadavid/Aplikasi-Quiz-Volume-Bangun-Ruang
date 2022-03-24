package com.example.quizdavid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var balok : Button
    private lateinit var prismaSegitiga : Button
    private lateinit var limassegiempat : Button
    private lateinit var kerucut : Button
    private lateinit var bola : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        balok = findViewById(R.id.btn_balok)
        prismaSegitiga = findViewById(R.id.btn_prismasegitiga)
        limassegiempat = findViewById(R.id.btn_limassegiempat)
        kerucut = findViewById(R.id.btn_kerucut)
        bola = findViewById(R.id.btn_bola)

        balok.setOnClickListener(this)
        prismaSegitiga.setOnClickListener(this)
        limassegiempat.setOnClickListener(this)
        kerucut.setOnClickListener(this)
        bola.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_balok -> run {
                val intentBalok = Intent(this@MainActivity, Balok::class.java)
                startActivity(intentBalok)
            }

            R.id.btn_prismasegitiga -> run {
                val intentPrismasegitiga = Intent(this@MainActivity, Prismasegitiga::class.java)
                startActivity(intentPrismasegitiga)
            }

            R.id.btn_limassegiempat -> run {
                val intentLimassegiempat = Intent(this@MainActivity, Limassegiempat::class.java)
                startActivity(intentLimassegiempat)
            }

            R.id.btn_kerucut -> run {
                val intentKerucut = Intent(this@MainActivity, Kerucut::class.java)
                startActivity(intentKerucut)
            }

            R.id.btn_bola -> run {
                val intentBola = Intent(this@MainActivity, Bola::class.java)
                startActivity(intentBola)
            }

        }
    }
}