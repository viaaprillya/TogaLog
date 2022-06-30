package com.viaaprillya.togalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvToga: RecyclerView
    private var list: ArrayList<Toga> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = ContextCompat.getColor(this, R.color.dark_green)

        rvToga = findViewById(R.id.rv_toga)
        rvToga.setHasFixedSize(true)

        list.addAll(TogaData.listData)
        showRecyclerList()

        var buttonAbout: ImageButton = findViewById(R.id.button_about)
        buttonAbout.setOnClickListener {
        val about = Intent(this@MainActivity, About::class.java)
        startActivity(about)
        }
    }

    private fun showRecyclerList() {
        val listTogaAdapter = ListTogaAdapter(list)
        rvToga.layoutManager = LinearLayoutManager(this)
        rvToga.adapter = listTogaAdapter

        listTogaAdapter.setOnItemClickListener(object : ListTogaAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val send = Intent(this@MainActivity, TogaDetail::class.java)
                send.putExtra("position",position)
                startActivity(send)
            }

        })
    }



}