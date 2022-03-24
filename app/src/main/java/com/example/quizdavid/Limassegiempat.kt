package com.example.quizdavid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Limassegiempat : AppCompatActivity() {

    private lateinit var tinggi : EditText
    private lateinit var sisiAlas : EditText
    private lateinit var hitung : Button
    private lateinit var volume : TextView
    private lateinit var jenis : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limassegiempat)

        tinggi = findViewById(R.id.et_tinggi)
        sisiAlas =findViewById(R.id.et_sisialas)
        volume = findViewById(R.id.tv_volumeLimas)
        jenis = findViewById(R.id.tv_jenislimas)

        hitung = findViewById(R.id.btn_hitung)
        hitung.setOnClickListener {
            hitungVol()
        }

    }

    private fun hitungVol (){
        val tinggiP = tinggi.text.toString().toFloat()
        val sisi = sisiAlas.text.toString().toFloat()
        val hasil = ((sisi*sisi)*tinggiP)/3
        tampilkanJenis(hasil)
        tampilkanVol(hasil)
    }

    private fun tampilkanVol (hasilHitung : Float){
        val strHasil : String
        strHasil = "$hasilHitung"
        volume.text = strHasil
    }

    private fun tampilkanJenis (hasilHitung: Float){
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