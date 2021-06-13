package com.example.pt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pt.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var dbPronaj = mutableListOf(
            PtData("FS - PT 4","04.22","10.22"),
            PtData("FS - PT 5","01.22","06.21"),
            PtData("FS - PT 6","02.22","07.21"),
            PtData("FS - PT 7","01.22","06.21"),
            PtData("FS - PT 8","03.22","09.21"),
            PtData("FS - PT 15","09.21","03.22"),
            PtData("FS - PT 16","12.21","06.22"),
            PtData("FS - PT 18","11.21","05.22"),
            PtData("FS - PT 19","09.21","03.22"),
            PtData("FS - PT 24","04.22","10.22"),
            PtData("FS - PT 26","11.21","05.22"),
            PtData("FS - PT 28","01.22","06.21"),
        )

        val adapter = PtAdapter(dbPronaj)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)



    }
}