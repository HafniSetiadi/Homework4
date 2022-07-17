package com.setiadi.homework4

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.setiadi.homework4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnSubmit?.setOnClickListener {
            binding?.tvHelloWorld?.text ="Yeay akhirnya bisa juga terkoneksi!!" }

        binding?.btnGuntingH?.setOnClickListener {
            binding?.tvHelloWorld?.text ="Anda Pilih Gunting" }

        binding?.btnGuntingC?.setOnClickListener {
            binding?.tvHelloWorld?.text ="Computer Pilih Gunting" }

        binding?.rgYesOrNot?.setOnCheckedChangeListener { radioGroup, id ->
            if (id == R.id.rbYes) {
                binding?.tvHelloWorld?.text = "Yes Siap"
            }else {
                binding?.tvHelloWorld?.text = "No Siap Boss"
            }
        }

    }
}