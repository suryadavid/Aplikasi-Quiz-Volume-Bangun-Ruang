package com.example.quizdavid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Kerucut : AppCompatActivity() {

    private lateinit var tinggi : EditText
    private lateinit var jari : EditText
    private lateinit var hitung : Button
    private lateinit var volume : TextView
    private lateinit var jenis : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kerucut)

        tinggi = findViewById(R.id.et_tinggi)
        jari = findViewById(R.id.et_jariKerucut)
        volume = findViewById(R.id.tv_volumeKerucut)
        jenis = findViewById(R.id.tv_jeniskerucut)

        hitung = findViewById(R.id.btn_hitung)
        hitung.setOnClickListener {
            Volume()
        }


    }
    private fun Volume(){
        val t = tinggi.text.toString().toFloat()
        val r = jari.text.toString().toFloat()
        val hasil : Double = (3.14*(r*r)*t)/3
        tampilkanVol(hasil)
        tampilkanJenis(hasil)
    }

    private fun tampilkanVol (hasilHitung : Double){
        val strHasil : String
        strHasil = "$hasilHitung"
        volume.text = strHasil
    }

    private fun tampilkanJenis (hasilHitung: Double){
        var jenis : String?
        if (hasilHitung > 200){
            jenis = "Volume Besar"
        } else if (hasilHitung<=100){
            jenis = "Volume Kecil"
        } else {
            jenis = "Volume Sedang"
        }
        val jbl = "$jenis"
        this.jenis.text = jbl
    }
}