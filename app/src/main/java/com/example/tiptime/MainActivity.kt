package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
    }


    private fun calculateTip(){
        //Get the decimal value from the cost fo service text field
        val stringInTextField =binding.costOfServiceEditText.text.toString()
        val cost =stringInTextField.toDoubleOrNull()
    }
}