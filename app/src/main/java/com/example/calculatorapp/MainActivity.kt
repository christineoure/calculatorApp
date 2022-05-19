package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etnumber: EditText
    lateinit var  etnumber1: EditText
    lateinit var btnAdd: Button
    lateinit var btnsubtract: Button
    lateinit var btndivide: Button
    lateinit var btnmultiply: Button
    lateinit var tvcalculate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btndivide = findViewById(R.id.btndivide)
        btnmultiply = findViewById(R.id.btnmultiply)
        etnumber = findViewById(R.id.etnumber)
        etnumber1 = findViewById(R.id.etnumber1)
        tvcalculate = findViewById(R.id.tvcalculate)

        btnAdd.setOnClickListener {
            var num = etnumber.text.toString().toDouble()
            var num1 = etnumber1.text.toString().toDouble()
            Add(num, num1)
        }
        btnsubtract.setOnClickListener {
            var numa = etnumber.text.toString().toDouble()
            var numb = etnumber1.text.toString().toDouble()
            Subtract(numa, numb)
        }
        btnmultiply.setOnClickListener {
            var numc = etnumber.text.toString().toDouble()
            var numd = etnumber1.text.toString().toDouble()
            multiply(numc, numd)
        }
        btndivide.setOnClickListener {
            var nume = etnumber.text.toString().toDouble()
            var numf = etnumber1.text.toString().toDouble()
            divide(nume, numf)
        }

    }

    fun divide(nume: Double, numf: Double) {
        var divide = nume / numf
        tvcalculate.text = divide.toString()
    }

    fun multiply(numc: Double, numd: Double) {
        var multiply = numc * numd
        tvcalculate.text = multiply.toString()
    }

    fun Subtract(numa: Double, numb: Double) {
        var subtract = numa - numb
        tvcalculate.text = subtract.toString()
    }

    fun Add(num: Double, num1: Double) {
         var add = num + num1
         tvcalculate.text = add.toString()

    }
}