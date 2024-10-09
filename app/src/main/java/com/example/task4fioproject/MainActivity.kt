package com.example.task4fioproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dataset=buildList()

        val rv: RecyclerView = findViewById(R.id.recyclerView)

        rv.adapter=EmployeeAdapter(dataset)

        rv.layoutManager= LinearLayoutManager(this)

    }

    fun buildList():List<Employee>{
        val list= mutableListOf<Employee>()
        list.add(Employee(
            "Иван Иванович",
            R.drawable.images,
            4,
            2000,
            4,
            "Backend"
        ))
        list.add(Employee(
            "Сергей Сергеевич",
            R.drawable.images2,
            5,
            1000,
            10,
            "Frontend"
        ))
        list.add(Employee(
            "Анастасия Валерьевна",
            R.drawable.images3,
            2,
            100,
            3,
            "Frontend"
        ))
        return list
    }

}