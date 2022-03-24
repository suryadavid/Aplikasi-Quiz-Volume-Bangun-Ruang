package com.example.quizdavid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Bola : AppCompatActivity() {

    private lateinit var jari : EditText
    private lateinit var hitung : Button
    private lateinit var volume : TextView
    private lateinit var jenis : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bola)

        jari = findViewById(R.id.et_jariBola)
        volume = findViewById(R.id.tv_volumeBola)
        jenis = findViewById(R.id.tv_jenisBola)

        hitung = findViewById(R.id.btn_hitung)
        hitung.setOnClickListener {
            Volume()
        }

    }

    private fun Volume (){
        val r = jari.text.toString().toFloat()
        val hasil = 4*3.14*(r*r*r)/3
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