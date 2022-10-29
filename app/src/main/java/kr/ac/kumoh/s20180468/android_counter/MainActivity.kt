package kr.ac.kumoh.s20180468.android_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kr.ac.kumoh.s20180468.android_counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val model:CounterViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.count.text = model.count.toString()

        binding.btnAdd.setOnClickListener {
            model.add()
            binding.count.text = model.count.toString()
        }
        binding.btnMinus.setOnClickListener {
            model.minus()
            binding.count.text = model.count.toString()
        }

    }
}