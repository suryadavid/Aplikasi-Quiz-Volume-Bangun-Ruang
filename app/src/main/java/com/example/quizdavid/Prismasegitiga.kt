package com.example.quizdavid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Prismasegitiga : AppCompatActivity() {

    private lateinit var tinggiP : EditText
    private lateinit var tinggiS : EditText
    private lateinit var alas : EditText
    private lateinit var volumePS : TextView
    private lateinit var jenisPS : TextView
    private lateinit var hitungVolPS : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prismasegitiga)

        tinggiP = findViewById(R.id.et_tinggip)
        tinggiS = findViewById(R.id.et_tinggi)
        alas = findViewById(R.id.et_alasSegitiga)
        volumePS = findViewById(R.id.tv_volumePrisma)
        jenisPS = findViewById(R.id.tv_jenisPrisma)

        hitungVolPS = findViewById(R.id.btn_hitung)
        hitungVolPS.setOnClickListener {
            volumPS()
        }

    }
    private fun volumPS(){
        val tPrisma = tinggiP.text.toString().toFloat()
        val tSPrisma = tinggiS.text.toString().toFloat()
        val aSPrisma = alas.text.toString().toFloat()
        val volumePrisma = (aSPrisma*tSPrisma/2)*tPrisma
        tampilkanVol(volumePrisma)
        tampilkanJenis(volumePrisma)
    }

    private fun tampilkanVol (hasilHitung : Float){
        val strHasil : String
        strHasil = "$hasilHitung"
        volumePS.text = strHasil
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
        jenisPS.text = jbl
    }
}