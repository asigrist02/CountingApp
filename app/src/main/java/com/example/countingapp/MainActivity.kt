package com.example.countingapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var count = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val display = binding.tv1
        val btn = binding.btn1

        btn.setOnClickListener {
            count.addCount()
            display.text = count.getCount().toString()
        }
    }
}
class Counter {
    private var count: Int = 0
    fun addCount() {
        count++
    }

    fun getCount(): Int {
        return count
    }
}

