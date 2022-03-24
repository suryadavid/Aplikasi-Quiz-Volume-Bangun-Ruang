package com.example.quizdavid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Balok : AppCompatActivity() {

    private lateinit var panjang : EditText
    private lateinit var lebar : EditText
    private lateinit var tinggi : EditText
    private lateinit var volume : TextView
    private lateinit var jenis :TextView
    private lateinit var hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)

        panjang = findViewById(R.id.et_panjang)
        lebar = findViewById(R.id.et_lebar)
        tinggi = findViewById(R.id.et_tinggi)
        volume = findViewById(R.id.tv_volume)
        jenis = findViewById(R.id.tv_jenisbalok)

        hitung = findViewById(R.id.btn_hitung)
        hitung.setOnClickListener {
            volume()
        }
    }

    private fun volume(){
        val panjangBalok = panjang.text.toString().toFloat()
        val tinggiBalok = tinggi.text.toString().toFloat()
        val lebarBalok = lebar.text.toString().toFloat()
        val volumeBalok = panjangBalok*lebarBalok*tinggiBalok
        tampilkanVol(volumeBalok)
        tampilkanJenis(volumeBalok)
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