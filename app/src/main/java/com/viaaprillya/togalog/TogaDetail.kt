package com.viaaprillya.togalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TogaDetail : AppCompatActivity() {
    private var listToga: ArrayList<Toga> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toga_detail)
        window.statusBarColor = ContextCompat.getColor(this,R.color.dark_green)
        listToga.addAll(TogaData.listData)
        var position = intent.getIntExtra("position",0)
        val toga = listToga[position]

        var botanicalPhoto : ImageView = findViewById(R.id.botanical)
        var realPhoto : ImageView = findViewById(R.id.photo_real)
        var description : TextView = findViewById(R.id.deskripsi)
        var textKhasiat : TextView  = findViewById(R.id.txt_khasiat)
        var nama_lokal : TextView = findViewById(R.id.tv_item_nama_lokal)
        var nama_ilmiah : TextView  = findViewById(R.id.tv_item_nama_ilmiah)

        botanicalPhoto.setImageResource(toga.botanical)
        realPhoto.setImageResource(toga.photo)
        description.text = toga.desc
        textKhasiat.text = toga.khasiat
        nama_lokal.text = toga.nama_lokal
        nama_ilmiah.text = toga.nama_ilmiah
    }

}